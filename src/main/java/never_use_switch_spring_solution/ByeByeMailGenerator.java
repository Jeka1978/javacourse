package never_use_switch_spring_solution;

import org.springframework.stereotype.Component;

@Component("3")
public class ByeByeMailGenerator implements MailGenerator {
    @Override
    public String generate() {
        return "bye bye";
    }
}
