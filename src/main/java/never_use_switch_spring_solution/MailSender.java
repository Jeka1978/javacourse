package never_use_switch_spring_solution;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MailSender {
    @Autowired
    private MailDao mailDao;

    @Autowired
    private Map<String,MailGenerator> map;


    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail() {
        String mailCode = String.valueOf(mailDao.getMailCode());
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











