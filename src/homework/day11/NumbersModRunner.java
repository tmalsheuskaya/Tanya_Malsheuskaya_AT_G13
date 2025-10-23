package homework.day11;

import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Comparator;

public class NumbersModRunner {
    public static void main(String[] args) {
        try {
            Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090)
                    .map(String::valueOf)
                    .filter(s -> s.contains("3"))
                    .flatMap(num -> Arrays.stream(num.split("")))
                    .map(NumbersModRunner::digitToWord)
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .forEach(System.out::println);
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
