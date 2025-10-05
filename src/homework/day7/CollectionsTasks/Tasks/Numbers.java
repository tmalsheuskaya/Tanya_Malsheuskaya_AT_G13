package homework.day7.CollectionsTasks.Tasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        numbers.forEach(System.out::println);

        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println(sum);

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        Collections.reverse(numbers);

        numbers.forEach(n -> System.out.print(n + " "));
    }
}
