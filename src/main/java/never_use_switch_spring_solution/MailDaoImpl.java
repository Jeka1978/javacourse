package never_use_switch_spring_solution;

import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
public class MailDaoImpl implements MailDao {
    private Random random = new Random();
    @Override
    public int getMailCode() {
        return random.nextInt(3) + 1;
    }
}
