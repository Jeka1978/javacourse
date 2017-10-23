package my_test_framework;

import animals.Animal;
import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;
import org.reflections.Reflections;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestRunner {

    @SneakyThrows
    public static void runAllTests(Class type) {

        Method beforeMethod = null;
        Method afterMethod = null;

        if (!Modifier.isAbstract(type.getModifiers())) {


            Method[] methods = type.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(MyBeforeClass.class)) {
                    method.invoke(null);
                }
            }

            for (Method method : methods) {
                if (method.isAnnotationPresent(MyBefore.class)) {
                    beforeMethod = method;
                }
                if (method.isAnnotationPresent(MyAfter.class)) {
                    afterMethod = method;
                }
            }
            for (Method method : methods) {
                if (method.getName().startsWith("test")) {
                    Object o = type.newInstance();
                    if (beforeMethod != null) {
                        beforeMethod.invoke(o);
                    }
                    method.invoke(o);
                    if (afterMethod != null) {
                        afterMethod.invoke(o);
                    }

                }
            }
        }
    }
}
