package enums;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Human {
    private String name;
    private MaritalStatus maritalStatus;

    public static void main(String[] args) {
        Human human = new Human("Hadas", MaritalStatus.SINGLE);
        System.out.println("human = " + human.getMaritalStatus().getHebrewDesc());
    }
}
