package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.lang.management.ManagementFactory;
import java.util.List;

public class TerminatorQuoter implements Quoter {
    @Setter
    private List<String> messages;

    @PostConstruct
    public void init() {
        System.out.println("Give me your close");
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }


    public void killAll(){
        new Thread(() -> {
            System.out.println("You are terminated");
        }).start();

    }
}
