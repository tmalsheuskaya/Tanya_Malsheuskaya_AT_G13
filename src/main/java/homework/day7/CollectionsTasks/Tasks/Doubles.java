package homework.day7.CollectionsTasks.Tasks;

import java.util.Arrays;
import java.util.List;

public class Doubles {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        doubles.forEach(System.out::println);

        double product = 1;
        for (Double d : doubles) {
            product *= d;
        }
        System.out.println(product);

        double fractionalSum = 0;
        for (Double d : doubles) {
            fractionalSum += d - d.intValue();
        }
        System.out.println(fractionalSum);

        for (int i = 0; i < doubles.size(); i++) {
            System.out.print(doubles.get(i).intValue() + " ");
        }
        System.out.println();

    }
}
