package mySpring;

import org.reflections.ReflectionUtils;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Set;

public class BenchmarkProxyConfigurator implements ProxyConfigurator {
    private BenchmarkToggle bencmarkToggle = new BenchmarkToggle();

    @Override
    public Object wrapWithProxy(Object t, Class type) {
        Set<Method> allMethods = ReflectionUtils.getAllMethods(type, method -> method.isAnnotationPresent(Benchmark.class));

        if (type.isAnnotationPresent(Benchmark.class)|| !allMethods.isEmpty()) {
            if (type.getInterfaces().length == 0) {
                return Enhancer.create(type, (InvocationHandler) (o, method, args) -> invoke(method, args, type, t));
            }

            return Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), (proxy, method, args) -> {
                return invoke(method, args, type, t);
            });


        }else {
            return t;
        }

    }

    private Object invoke(Method method, Object[] args, Class type, Object t) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method originalMethod = type.getMethod(method.getName(), method.getParameterTypes());
        if (bencmarkToggle.isEnabled() && (originalMethod.isAnnotationPresent(Benchmark.class) || type.isAnnotationPresent(Benchmark.class))) {
            System.out.println("*********** BENCHMARK for method "+method.getName()+" **************");
            long start = System.nanoTime();
            Object retVal = method.invoke(t, args);
            long end = System.nanoTime();
            System.out.println(end-start);
            System.out.println("*********** END of BENCHMARK for method "+method.getName()+" **************");
            return retVal;
        } else {
            return method.invoke(t, args);
        }
    }
}
