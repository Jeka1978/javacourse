package quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
public class TalkingRobotImpl implements TalkingRobot {
    @Autowired(required = false)
    private List<Quoter> quoters = Arrays.asList((Quoter) () -> System.out.println("This is default quote"));


    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }


}
