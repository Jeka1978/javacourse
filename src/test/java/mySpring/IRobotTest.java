package mySpring;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class IRobotTest {
    @Test
    public void cleanRoom() throws Exception {
        IRobot iRobot = new IRobot();
        Cleaner cleaner = Mockito.mock(Cleaner.class);
        iRobot.setCleaner(cleaner);
        iRobot.setSpeaker(Mockito.mock(Speaker.class));
        iRobot.cleanRoom();
    }

}