package homework.day11;

import java.util.stream.Stream;

public class NumbersRunner {
    public static void main(String[] args) {
        try {
            Stream<Integer> numbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699);

            numbers.forEach(System.out::println);

            int sum = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699)
                    .sorted()
                    .peek(System.out::println)
                    .mapToInt(Integer::intValue)
                    .sum();

            System.out.println(sum);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
