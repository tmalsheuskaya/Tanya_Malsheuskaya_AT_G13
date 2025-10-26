package homework.day7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileSaver {
    public void writeText(String input) {
        try (FileWriter writer = new FileWriter("savedfile.txt")) {
            writer.write("Hello, I just got '" + input + "' from you!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String text = scanner.nextLine();
            new FileSaver().writeText(text);
        }
    }
}
