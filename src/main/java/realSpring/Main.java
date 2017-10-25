package realSpring;

import mySpring.IRobot;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        IRobot iRobot = context.getBean(IRobot.class);
        iRobot.cleanRoom();
    }
}
