package tal_tsur;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
public class AmazonPerson extends Human{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "AmazonPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + getSalary() +
                '}';
    }
}
