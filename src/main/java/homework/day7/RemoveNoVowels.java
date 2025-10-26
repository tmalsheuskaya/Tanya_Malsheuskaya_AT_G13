package homework.day7;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class RemoveNoVowels {
    public void processFile(String fileName) {
        try {
            String content = new String(java.nio.file.Files.readAllBytes(new File(fileName).toPath()));
            String onlyVowels = content.replaceAll("(?i)[^aeiouаеёиоуыэюя]", "");
            String newContent = content + "\n\n" + onlyVowels;
            java.nio.file.Files.write(new File(fileName).toPath(), newContent.getBytes());
        } catch (IIOException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new RemoveNoVowels().processFile("savedfile.txt");
    }
}
