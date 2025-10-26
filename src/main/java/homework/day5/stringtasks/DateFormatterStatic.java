package homework.day5.stringtasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterStatic {
    public static void reformat(String input) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("HH.mm dd.MM.yyyy");
        LocalDateTime dateTime = LocalDateTime.parse(input, inputFormatter);

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMMM, d, yyyy HH:mm", Locale.ENGLISH);
        System.out.println(dateTime.format(outputFormatter));
    }
}
