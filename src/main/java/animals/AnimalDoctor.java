package animals;

import lombok.EqualsAndHashCode;

public class AnimalDoctor {
    private String name;
    private int age;
    public void treat(Animal animal) {
        animal.makeVoice();

        if (animal instanceof Dog) {
            ((Dog) animal).bringSomething("stick");
        }
    }
}
