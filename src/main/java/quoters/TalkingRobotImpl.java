package quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class TalkingRobotImpl implements TalkingRobot {


    @Autowired
    @Film
    private Quoter quoter;

    @Autowired
    private List<Quoter> quoters = Arrays.asList((Quoter) () -> System.out.println("This is default quote"));


    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }


}
