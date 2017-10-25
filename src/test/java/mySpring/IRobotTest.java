package mySpring;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.junit.Assert.*;

public class IRobotTest {
    @Test
    public void cleanRoom() throws Exception {
        IRobot iRobot = new IRobot();
        Cleaner cleaner = Mockito.mock(Cleaner.class);
        Mockito.doAnswer(invocationOnMock -> {
            System.out.println("Cleaninig....");
            return null;
        }).when(cleaner).clean();
//        iRobot.setCleaner(cleaner);
//        iRobot.setSpeaker(Mockito.mock(Speaker.class));
        iRobot.cleanRoom();
    }

}