package never_use_switch_spring_solution;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MailSender {
    @Autowired
    private MailDao mailDao;

    private Map<Integer, MailGenerator> map = new HashMap<>();

    @Autowired
    public void initMap(List<MailGenerator> generators) {
        for (MailGenerator generator : generators) {
            if (map.containsKey(generator.mailCode())) {
                throw new RuntimeException(generator.mailCode() + " already exists");
            }
            map.put(generator.mailCode(), generator);
        }
    }


    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail() {
        int mailCode = mailDao.getMailCode();
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new RuntimeException(mailCode + " not supported yet");
        }
        String html = mailGenerator.generate();
        send(html);
    }

    private void send(String html) {
        System.out.println("html = " + html);
    }
}











