package mySpring.configurators;

import lombok.SneakyThrows;
import mySpring.InjectRandomInt;
import mySpring.ObjectConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

import java.lang.reflect.Field;
import java.util.Random;

public class InjectRandomIntAnnotationObjectConfigurator implements ObjectConfigurator, BeanPostProcessor {
    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        configure(bean);
        return bean;
    }

    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Field[] declaredFields = type.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(InjectRandomInt.class)) {
                InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
                int min = annotation.min();
                int max = annotation.max();
                Random random = new Random();
                int value = min + random.nextInt(max - min);
                field.setAccessible(true);
                field.set(t,value);
            }
        }
    }
}
