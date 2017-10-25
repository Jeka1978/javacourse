package mySpring;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;

public class InjectByFieldTypeObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object o) {
        Class<?> type = o.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {

            if (field.isAnnotationPresent(InjectByFieldType.class)) {
                field.setAccessible(true);
                ObjectFactory factory = ObjectFactory.getInstance();
                Object value = factory.createObject(field.getType());
                field.set(o,value);
            }
        }
    }
}
