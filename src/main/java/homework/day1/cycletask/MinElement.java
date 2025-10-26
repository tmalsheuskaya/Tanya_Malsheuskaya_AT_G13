package cycletask;

public class MinElement {
    public void findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
