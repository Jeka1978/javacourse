package mySpring;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import javax.annotation.PostConstruct;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();
    private Reflections scanner = new Reflections("mySpring");

    private List<ObjectConfigurator> configurators = new ArrayList<>();
    private List<ProxyConfigurator> proxyConfigurators = new ArrayList<>();

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    @SneakyThrows
    private ObjectFactory() {
        Set<Class<? extends ObjectConfigurator>> classes = scanner.getSubTypesOf(ObjectConfigurator.class);
        for (Class<? extends ObjectConfigurator> aClass : classes) {
            configurators.add(aClass.newInstance());
        }
        Set<Class<? extends ProxyConfigurator>> classSet = scanner.getSubTypesOf(ProxyConfigurator.class);
        for (Class<? extends ProxyConfigurator> aClass : classSet) {
            proxyConfigurators.add(aClass.newInstance());
        }
    }



    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        type = resolveImpl(type);
        T t = type.newInstance();
        configure(t);
        secondPhaseConstructor(type, t);
        t = configureProxy(type, t);
        return t;
    }













    private <T> T configureProxy(Class<T> type, T t) {
        for (ProxyConfigurator proxyConfigurator : proxyConfigurators) {
            t = (T) proxyConfigurator.wrapWithProxy(t, type);
        }
        return t;
    }

    private <T> void secondPhaseConstructor(Class<T> type, T t) throws IllegalAccessException, InvocationTargetException {
        Method[] methods = type.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(PostConstruct.class)) {
                method.invoke(t);
            }
        }
    }

    private <T> void configure(T t) {
        for (ObjectConfigurator configurator : configurators) {
            configurator.configure(t);
        }
    }

    private <T> Class<T> resolveImpl(Class<T> type) {
        if (type.isInterface()) {
            Class impl = config.resolveImpl(type);
            if (impl == null) {
                Set<Class<? extends T>> classes = scanner.getSubTypesOf(type);
                if (classes.size() != 1) {
                    throw new RuntimeException("0 or more than one impl for " + type + " was found, please update your config");
                }
                impl = classes.iterator().next();

            }
            type = impl;
        }
        return type;
    }
}







