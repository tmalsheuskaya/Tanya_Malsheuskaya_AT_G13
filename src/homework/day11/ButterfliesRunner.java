package homework.day11;

import java.util.ArrayList;
import java.util.List;

public class ButterfliesRunner {
    public static void main(String[] args) {
        try {
            List<String> butterflies = new ArrayList<>();
            butterflies.add("Common blue");
            butterflies.add("Swallowtail");
            butterflies.add("Aglais io");
            butterflies.add("Common blue");

            butterflies.stream().map(s -> "\"" + s + "\"")
                    .filter(s -> s.toLowerCase()
                            .contains("a")
                            && s.toLowerCase().contains("o"))
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
