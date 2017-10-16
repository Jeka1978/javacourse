package strategy;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class AlarmImpl implements Alarm {
    @Override
    public void setTime(LocalDateTime dateTime) {
        System.out.println(dateTime.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.JAPAN));
    }
}
