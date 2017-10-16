package never_use_switch;

public class MailSender {

    public void sendMail(MailInfo mailInfo) {
        int mailCode = mailInfo.getMailCode();
        switch (mailCode) {
            case 1:
                //60 lines of code
                System.out.println("Welcome new client ");
                break;
            case 2:
                //50 lines of code
                System.out.println("don't call us anymore...");
                break;
            case 3:
                //50 lines of code
                System.out.println("Happy birhtday..");
                break;

        }

    }

}
