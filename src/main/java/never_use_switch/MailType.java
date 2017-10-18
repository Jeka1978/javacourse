package never_use_switch;

import com.nice.EmailCallbackMailGenerator;
import com.nice.HappyBirthdayMailGenerator;
import com.nice.MailGenerator;
import com.nice.WelcomeMailGenerator;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum MailType {
    WELCOME(1, new WelcomeMailGenerator()),
    EMAIL_CALLBACK(2, new EmailCallbackMailGenerator()),
    BIRTHDAY(3, new HappyBirthdayMailGenerator());

//    private static Map<Integer,MailType> fastCache = new HashMap<>();
    private final int dbCode;
    private final MailGenerator mailGenerator;

   /* MailType(int dbCode, MailGenerator mailGenerator) {
        this.dbCode = dbCode;
        this.mailGenerator = mailGenerator;
        fastCache.put(dbCode, this);
    }*/

    public static MailType findByDbCode(int dbCode) {
        MailType[] mailTypes = values();
        for (MailType mailType : mailTypes) {
            if (mailType.dbCode == dbCode) {
                return mailType;
            }
        }
        throw new RuntimeException(dbCode + " not support yet");
    }

}










