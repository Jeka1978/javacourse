package mySpring;

import animals.Dog;

public class Main {
    public static void main(String[] args) {
  /*      IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();*/

        ZooService zooService = ObjectFactory.getInstance().createObject(ZooService.class);
        zooService.getDogs().forEach(Dog::makeVoice);
        zooService.drinkBeer();


    }
}
