package homework.day5.stringtasks;

public class WordDuplicatesFinderStatic {
    public static void printDuplicates(String text) {
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) continue;
            boolean duplicateFound = false;
            for (int j = i + 1; j < words.length; j++) {
                if (words[j] != null && words[i].equals(words[j])) {
                    if (!duplicateFound) {
                        System.out.println("Duplicate word: " + words[i]);
                        duplicateFound = true;
                    }
                    words[j] = null;
                }
            }
        }
    }
}
