package never_use_switch_spring_solution;

import org.springframework.stereotype.Component;

@Component
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generate() {
        return "happy birthday";
    }

    @Override
    public int mailCode() {
        return 2;
    }
}
