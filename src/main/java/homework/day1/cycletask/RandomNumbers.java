package cycletask;

import java.util.Random;

public class RandomNumbers {
    private int[] array;

    public void fillArray() {
        int n = 7;                  // размер массива
        array = new int[n];         // создаём массив
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n); // случайные числа от 0 до 6
        }
    }

    public void printArray() {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int[] getArray() {
        return array;
    }
}
