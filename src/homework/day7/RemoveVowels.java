package homework.day7;

import java.io.File;
import java.io.IOException;

public class RemoveVowels {
    public void processFile(String fileName) {
        try {
            String content = new String(java.nio.file.Files.readAllBytes(new File(fileName).toPath()));
            String newContent = content.replaceAll("[AEIOUaeiouАЕЁИОУЫЭЮЯаеёиоуыэюя]", "");
            java.nio.file.Files.write(new File(fileName).toPath(), newContent.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new RemoveVowels().processFile("savedfile.txt");
    }
}
