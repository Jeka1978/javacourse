package mySpring;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.Set;

public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();
    private Reflections scanner = new Reflections("mySpring");

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
    }


    @SneakyThrows
    public <T>  T createObject(Class<T> type) {
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
        T t = type.newInstance();


        return t;
    }
}







