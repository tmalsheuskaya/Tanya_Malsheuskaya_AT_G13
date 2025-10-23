package homework.day11;

import java.util.ArrayList;
import java.util.List;

public class CitiesRunner {
    public static void main(String[] args) {
        try {
            List<String> cities = new ArrayList<>();
            cities.add("Минск");
            cities.add("Москва");
            cities.add("Берлин");

            int sum = cities.stream()
                    .mapToInt(String::length)
                    .sum();

            System.out.println(sum);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
