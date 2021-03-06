package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.List;

@Component
public class TerminatorQuoter implements Quoter {

    private List<String> messages;
    @Autowired
    private Quoter proxy;

    @Value("${terminator}")
    public void setMessages(String messages, @Value("${JAVA_HOME}") String javaHome) {
        System.out.println("javaHome = " + javaHome);
        this.messages = Arrays.asList(messages.split(","));
    }

    @PostConstruct
    public void init() {
        System.out.println("Give me your close");
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
        throw new DBRuntimeException("fire all DBA");
    }

    public void sayANother() {
        System.out.println("11111111111111111");
    }


    public void killAll() {
        new Thread(() -> {
            System.out.println("You are terminated");
        }).start();

    }
}
