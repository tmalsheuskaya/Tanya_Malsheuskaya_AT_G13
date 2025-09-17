package cycletask;

public class ReverseElements {
    public void swap(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
