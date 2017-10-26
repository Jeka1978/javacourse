package tal_tsur.google;

import lombok.Data;
import tal_tsur.Human;

@Data
public class Person extends Human {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + getSalary() +
                '}';
    }
}
