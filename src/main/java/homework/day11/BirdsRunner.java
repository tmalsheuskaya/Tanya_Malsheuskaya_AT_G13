package homework.day11;

import java.util.Arrays;

public class BirdsRunner {
    public static void main(String[] args) {
        try {
            Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля").stream()
                    .map(s -> s.replace("о", "а").replace("О", "А"))
                    .map(String::toLowerCase)
                    .map(s -> s.replace("ь", ""))
                    .reduce((a, b) -> a + b)
                    .ifPresent(str -> Arrays.stream(str.split("б"))
                            .forEach(s -> System.out.println("--" + s + "--")));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
