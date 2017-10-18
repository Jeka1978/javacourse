package never_use_switch;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.fluttercode.datafactory.impl.DataFactory;
import org.slf4j.LoggerFactory;
import strategy.Alarm;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;

@Slf4j
public class Main {
    @SneakyThrows
    public static void main(String[] args) {



        MailSender mailSender = new MailSender();

        DataFactory dataFactory = new DataFactory();

        while (true) {

            Client client = new Client(dataFactory.getName());
            MailInfo mailInfo = new MailInfo(client,
                    dataFactory.getNumberBetween(1, 4));
            try {
                mailSender.sendMail(mailInfo);
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
            Thread.sleep(1000);
        }


    }
}
