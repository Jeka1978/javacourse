package quoters;

import lombok.Setter;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import java.util.List;

public class TalkingRobotImpl implements TalkingRobot {
    @Setter
    private List<Quoter> quoters;


    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }


}
