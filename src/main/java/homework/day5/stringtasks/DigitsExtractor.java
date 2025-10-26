package homework.day5.stringtasks;

public class DigitsExtractor {
    public void extractDigits(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                count++;
            }
        }

        int[] digits = new int[count];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                digits[index++] = Character.getNumericValue(text.charAt(i));
            }
        }

        for (int d : digits) {
            System.out.println(d);
        }
    }
}
