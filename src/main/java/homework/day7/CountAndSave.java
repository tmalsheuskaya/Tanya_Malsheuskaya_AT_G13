package homework.day7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CountAndSave {
    public void run() {
        try {
            String text = Files.readString(Path.of("savedfile.txt"));
            int count = text.length();
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss"));
            String filename = timestamp + "_" + count + ".txt";
            Files.writeString(Path.of(filename), "Symbols: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new CountAndSave().run();
    }
}
