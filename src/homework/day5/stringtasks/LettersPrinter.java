package homework.day5.stringtasks;

public class LettersPrinter {
    public void printLetters(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}
