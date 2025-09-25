package homework.day5.stringtasks;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class VowelDateGeneratorStatic {
    public static void generateDate(String text) {
        String vowels = "aeiouаеёиоуыэюя";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(Character.toLowerCase(text.charAt(i))) >= 0) {
                count++;
            }
        }
        LocalDate date = LocalDate.now().plusDays(count);
        String month = date.getMonth().getDisplayName(TextStyle.FULL, new Locale("ru"));
        System.out.printf("Сгенерированная гласная дата: %d %s%n", date.getDayOfMonth(), month);
    }
}
