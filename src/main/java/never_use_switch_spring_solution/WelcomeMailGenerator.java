package never_use_switch_spring_solution;

import org.springframework.stereotype.Component;

@Component("1")
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generate() {
        return "WElcome new client";
    }
}
