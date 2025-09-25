package homework.day5.stringtasks;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class CurrentDatePrinterStatic {
    public static void printNow() {
        LocalDateTime now = LocalDateTime.now();
        String month = now.getMonth().getDisplayName(TextStyle.FULL, new Locale("ru"));
        System.out.printf("Сейчас на дворе: %d %s, %d, %d часа %d минут%n",
                now.getDayOfMonth(), month, now.getYear(), now.getHour(), now.getMinute());
    }
}
