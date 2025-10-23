package homework.day11;

import java.util.stream.Stream;
import java.util.Arrays;

public class ElementsRunner {
    public static void main(String[] args) {
        try {
            Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb")
                    .flatMap(el -> Arrays.stream(el.split(" ")))
                    .map(word -> word.length() % 2 != 0
                            ? word.replace("e", "o").replace("E", "O")
                            : String.valueOf(word.length()))
                    .distinct()
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
