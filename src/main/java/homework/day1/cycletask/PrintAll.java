package cycletask;

public class PrintAll {
    public void print(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // перенос строки
    }
}
