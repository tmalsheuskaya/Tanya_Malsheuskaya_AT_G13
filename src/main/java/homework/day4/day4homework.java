package homework.day4;

public class day4homework {

    public static int sumEveryNth(int[] arr, int n) {
        int sum = 0;
        for (int i = n - 1; i < arr.length; i += n) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] filterGreaterThanN(int[] arr, int n) {
        int count = 0;
        for (int value : arr) {
            if (value > n) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = count - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                result[index] = arr[i];
                index--;
            }
        }
        return result;
    }


    public static int sumDivisibleByFirstDigitOfLength(int[] arr) {
        int length = arr.length;
        int firstDigit = Integer.parseInt(Integer.toString(length).substring(0, 1));

        int sum = 0;
        for (int value : arr) {
            if (value % firstDigit == 0) {
                sum += value;
            }
        }
        return sum;
    }


    public static void draw() {
        System.out.println("      ^__^");
        System.out.println("      (oo)\\\\_______");
        System.out.println("     (__)\\ ) \\/\\  \\");
        System.out.println("          ||----w |\\");
        System.out.println("          ||     ||");
    }
}

