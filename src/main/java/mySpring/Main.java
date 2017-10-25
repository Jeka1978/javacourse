package mySpring;

import animals.Dog;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        while (true) {
            iRobot.cleanRoom();
            Thread.sleep(2500);
        }
/*
        ZooServiceImpl zooService = ObjectFactory.getInstance().createObject(ZooServiceImpl.class);
        zooService.getDogs().forEach(Dog::makeVoice);
        zooService.drinkBeer();
        System.out.println(zooService.getClass());*/


    }
}
