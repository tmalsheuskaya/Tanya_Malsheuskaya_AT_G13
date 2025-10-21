package homework.day11;

import java.util.stream.Stream;

public class CarsRunner {
    public static void main(String[] args) {
        try {
            Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди")
                    .distinct()
                    .filter(s -> s.toLowerCase().contains("и"))
                    .skip(1)
                    .map(String::toUpperCase)
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
