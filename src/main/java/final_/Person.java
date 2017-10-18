package final_;

public class Person {
    private final int age;

    public Person(int age) {
        this.age = age;
        new Person();
    }

    public Person(int... nums) {
        age = 1;
    }
}
