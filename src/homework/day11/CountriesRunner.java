package homework.day11;

import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {
        try {
            Stream.of("Андора", "Португалия", "Англия", "Замбия")
                    .filter(country -> country.matches(".*[аеёиоуыэюяAEIOUYaeiouy].*"))
                    .filter(country -> country.length() < 7)
                    .map(String::toUpperCase)
                    .map(s -> "\"" + s + "\"")
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
