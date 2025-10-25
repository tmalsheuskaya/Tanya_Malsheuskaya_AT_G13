package homework.day11;

import homework.day7.CollectionsTasks.PreparedClasses.Sand;
import java.util.*;
import java.util.stream.*;
import java.io.PrintWriter;

public class SandRunner {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("sand_map.txt")) {

            List<Sand> sandbox = Arrays.asList(
                    new Sand(12, "Речной"),
                    new Sand(8, "Речной"),
                    new Sand(15, "Карьерный"),
                    new Sand(7, "Карьерный"),
                    new Sand(11, "Речной")
            );

            Map<Integer, String> sandMap = sandbox.stream()
                    .filter(s -> s.getWeight() > 9 && s.getName().contains("ч"))
                    .sorted(Comparator.comparingInt(Sand::getWeight))
                    .map(s -> new Sand(s.getWeight() * 2, s.getName().toUpperCase()))
                    .collect(Collectors.toMap(Sand::getWeight, Sand::getName));

            sandMap.forEach((key, value) -> writer.println(value + ":" + key));

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
