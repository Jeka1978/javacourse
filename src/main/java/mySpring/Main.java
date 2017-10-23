package mySpring;

import com.nice.Person;

public class Main {
    public static void main(String[] args) {
        IRobot iRobot = new IRobot();
        iRobot.cleanRoom();

        Person object = ObjectFactory.getInstance().createObject(Person.class);
    }
}
