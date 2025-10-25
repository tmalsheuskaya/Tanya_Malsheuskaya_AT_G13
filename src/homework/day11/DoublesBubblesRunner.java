package homework.day11;

import homework.day7.CollectionsTasks.PreparedClasses.Bubble;
import java.util.Random;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.List;
import java.util.stream.Collectors;

public class DoublesBubblesRunner {
    public static void main(String[] args) {
        try {
            Random random = new Random();

            List<Integer> randomNumbers = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9)
                    .map(d -> (int) Math.round(d))
                    .flatMap(n -> IntStream.range(0, n > 0 ? 1 : 0)
                            .mapToObj(i -> random.nextInt(n + 1)))
                    .distinct()
                    .collect(Collectors.toList());

            List<Bubble> bubbles = randomNumbers.stream()
                    .flatMap(num -> IntStream.range(0, num)
                    .mapToObj(i -> new Bubble(num, "Bubble vol-" + i)))
                    .collect(Collectors.toList());

            bubbles.forEach(System.out::println);

            int totalVolume = bubbles.stream()
                    .mapToInt(Bubble::getVolume)
                    .sum();

            System.out.println("Total volume: " + totalVolume);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
