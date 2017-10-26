package momika;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class RandomNameConfigurator {
    public void configure(Object o) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException {
        Class<?> type = o.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                Field fieldH = annotation.getClass().getSuperclass().getDeclaredField("h");
                fieldH.setAccessible(true);
                Object o1 = Class.forName("sun.reflect.annotation.AnnotationInvocationHandler").cast(fieldH.get(annotation));
                Field memberValueField = o1.getClass().getDeclaredField("memberValues");
                memberValueField.setAccessible(true);
                Object o2 = memberValueField.get(o1);
                System.out.println(o2);
            }
        }
    }
}
