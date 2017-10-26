package never_use_switch_spring_solution;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generate() {
        return "WElcome new client";
    }

    @Override
    public int mailCode() {
        return 1;
    }
}
