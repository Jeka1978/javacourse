package tal_tsur;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Tal Tsur", 44);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("tal_tsur");
        NiceService niceService = context.getBean(NiceService.class);
        niceService.savePersonToCloud(person);
    }
}
