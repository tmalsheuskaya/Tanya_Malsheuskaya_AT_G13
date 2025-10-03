package homework.day7;

import java.util.Scanner;

public class ConsoleReader {
    public void printText(String input) {
        System.out.println("Hello, I just got '" + input + "' from you!");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String text = scanner.nextLine();
            new ConsoleReader().printText(text);
        }
    }
}
