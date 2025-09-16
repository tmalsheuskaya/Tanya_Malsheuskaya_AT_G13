package cycletask;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public void sort(int[] array) {
        Integer[] temp = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(temp, Collections.reverseOrder());

        for (int num : temp) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
