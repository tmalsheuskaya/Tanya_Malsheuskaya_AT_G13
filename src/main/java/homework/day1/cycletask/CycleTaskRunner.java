package cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        While run1 = new While();
        run1.printNumbers();

        ForOdd run2 = new ForOdd();
        run2.printOddNumbers();

        RandomNumbers run3 = new RandomNumbers();
        run3.fillArray();
        run3.printArray();

        ReverseElements run4 = new ReverseElements();
        int[] arr = {5, 2, 9, 1, 7};
        run4.swap(arr);

        X5 run5 = new X5();
        run5.multiply(arr);

        Square run6 = new Square();
        run6.square(arr);

        MinElement run7 = new MinElement();
        run7.findMin(arr);

        ReverseNumbers run8 = new ReverseNumbers();
        run8.printReverse(arr);

        Sort run9 = new Sort();
        run9.sort(arr);


    }
}
