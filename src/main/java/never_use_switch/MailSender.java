package never_use_switch;

import com.nice.MailGenerator;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.lang.Math.sin;

public class MailSender {
    private Map<Integer, MailGenerator> map = new HashMap<>();


    @SneakyThrows
    public MailSender() {
        Reflections reflections = new Reflections("com.nice");
        Set<Class<? extends MailGenerator>> classes = reflections.getSubTypesOf(MailGenerator.class);
        for (Class<? extends MailGenerator> generatorClass : classes) {
            if (!Modifier.isAbstract(generatorClass.getModifiers())) {
                MailGenerator mailGenerator = generatorClass.newInstance();
                int mailCode = mailGenerator.mailCode();
                if (map.containsKey(mailCode)) {
                    throw new IllegalArgumentException(mailCode + " already in use");
                }
                map.put(mailCode, mailGenerator);
            }
        }
    }

    public void sendMail(MailInfo mailInfo) throws UnsupportedOperationException {
        int mailCode = mailInfo.getMailCode();


        String html = MailType.findByDbCode(mailCode)
                .getMailGenerator()
                .generateMailContent(mailInfo);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = now.withDayOfMonth(1);
        ZoneId berlin = ZoneId.of("Europe/Berlin");
        ZonedDateTime.now(ZoneOffset.UTC);
        ZonedDateTime.of(now, berlin);
//        ChronoUnit.DAYS.between(now, dayAfterTom);
        send(html);



    }

    private void send(String mailContent) {
        System.out.println("mailContent = " + mailContent);
        System.out.println("was sent...");
    }

}








