package homework.day11;

import homework.day7.CollectionsTasks.PreparedClasses.Chair;
import homework.day7.CollectionsTasks.PreparedClasses.Bubble;
import java.util.*;
import java.util.stream.*;
import java.io.PrintWriter;

public class ChairRunner {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("max_chair_bubble.txt")) {
            Random rand = new Random();

            List<Chair> chairs = Arrays.asList(
                    new Chair(120, 40),
                    new Chair(90, 30),
                    new Chair(100, 50),
                    new Chair(110, 45)
            );

            OptionalInt maxValue = chairs.stream()
                    .filter(c -> c.getHeight() >= 100 && c.getWidth() >= 50)
                    .sorted(Comparator.comparingInt(Chair::getHeight)
                            .thenComparing((c1, c2) -> Integer.compare(c2.getWidth(), c1.getWidth())))
                    .map(c -> new Chair(c.getHeight() / 2, c.getWidth() * (rand.nextInt(6) + 3)))
                    .mapToInt(c -> c.getHeight() * c.getWidth())
                    .distinct()
                    .max();

            maxValue.ifPresent(max -> {
                String name = Arrays.stream(String.valueOf(max).split(""))
                        .map(ChairRunner::digitToWord)
                        .collect(Collectors.joining(" "));
                Bubble bubble = new Bubble(max, name);
                writer.println(bubble.toString());
            });

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }

    private static String digitToWord(String digit) {
        switch (digit) {
            case "0": return "ноль";
            case "1": return "один";
            case "2": return "два";
            case "3": return "три";
            case "4": return "четыре";
            case "5": return "пять";
            case "6": return "шесть";
            case "7": return "семь";
            case "8": return "восемь";
            case "9": return "девять";
            default: return digit;
        }
    }
}
