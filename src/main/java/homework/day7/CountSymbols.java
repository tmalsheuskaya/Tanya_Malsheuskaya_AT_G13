package homework.day7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CountSymbols {
    public void run() {
        try {
            String text = Files.readString(Path.of("savedfile.txt"));
            System.out.println(text.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new CountSymbols().run();
    }
}
