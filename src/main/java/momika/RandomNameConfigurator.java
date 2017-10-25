package momika;

import mySpring.InjectByFieldType;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;

public class RandomNameConfigurator {
    public void configure(Object o) throws NoSuchFieldException, IllegalAccessException {
        Class<?> type = o.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                Field fieldH = annotation.getClass().getSuperclass().getDeclaredField("h");
                fieldH.setAccessible(true);
                System.out.println();
            }
        }
    }
}
