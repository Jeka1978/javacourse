package tal_tsur;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@NiceEntity("Person")
public class Person extends Human {
    private String name;
    private int age;
}
