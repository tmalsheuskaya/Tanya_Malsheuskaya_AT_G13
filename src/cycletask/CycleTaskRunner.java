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
        run4.swap();



    }
}
