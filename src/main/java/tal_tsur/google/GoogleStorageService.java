package tal_tsur.google;

import lombok.SneakyThrows;
import org.reflections.Reflections;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import tal_tsur.CloudStorageService;
import tal_tsur.NiceEntity;
import tal_tsur.Person;

//@Service
public class GoogleStorageService implements CloudStorageService {
    private Reflections reflections = new Reflections("tal_tsur.amazon");
    @Override
    @SneakyThrows
    public void save(Person person) {
        String simpleClassName = person.getClass().getAnnotation(NiceEntity.class).value();
        Class<?> amazonClass = Class.forName("tal_tsur.google." + simpleClassName);
        Object amazonDataObject = amazonClass.newInstance();
        BeanUtils.copyProperties(person,amazonDataObject);
        System.out.println("google was saved " + amazonDataObject);
    }
}
