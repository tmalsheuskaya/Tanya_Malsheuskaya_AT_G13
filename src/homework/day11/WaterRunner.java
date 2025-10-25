package homework.day11;

import homework.day7.CollectionsTasks.PreparedClasses.Water;

import java.util.stream.Stream;

public class WaterRunner {
    public static void main(String[] args) {
        try {
            String allSmells = Stream.of(
                            new Water("Прозрачная", "Нет"),
                            new Water("Прозрачная", "Нет"),
                            new Water("Мутная", "Аммиачный"),
                            new Water("Синяя", "Мятный")
                    )
                    .filter(w -> !w.getColor().equals("Прозрачная"))
                    .sorted((w1, w2) -> w2.getSmell().compareTo(w1.getSmell()))
                    .map(w -> w.getSmell().replace("ы", "ыы"))
                    .reduce("", String::concat);
            System.out.println(allSmells.length());

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
