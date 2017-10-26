package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.management.ManagementFactory;
import java.util.List;

public class TerminatorQuoter implements Quoter {
    @Setter
    private List<String> messages;

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }
}
