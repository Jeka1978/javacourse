package momika;

import lombok.Data;
import mySpring.InjectRandomInt;

@Data
public class Person {
    @InjectRandomName(lang = "eng")
    @InjectRandomInt(min = 3,max = 5)
    private String name;
}
