package never_use_switch_spring_solution;

import org.springframework.stereotype.Component;

@Component("2")
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generate() {
        return "happy birthday";
    }
}
