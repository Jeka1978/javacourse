package never_use_switch_spring_solution;

import org.springframework.stereotype.Component;

@Component
public class ByeByeMailGenerator implements MailGenerator {
    @Override
    public String generate() {
        return "bye bye";
    }

    @Override
    public int mailCode() {
        return 3;
    }
}
