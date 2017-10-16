package never_use_switch;

import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;

import java.io.FileNotFoundException;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        MailSender mailSender = new MailSender();

        DataFactory dataFactory = new DataFactory();


        while (true) {
            Client client = new Client(dataFactory.getName());
            MailInfo mailInfo = new MailInfo(client, dataFactory.getNumberBetween(0, 2));
            mailSender.sendMail(mailInfo);
            Thread.sleep(1000);
        }


    }
}
