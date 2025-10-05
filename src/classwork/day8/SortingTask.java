package classwork.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SortingTask {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        String text = "мама мыла раму мыла";
        String[] words = text.split(" ");

      for (String word : words) {
          mySet.add(word);
      }

      Iterator<String> iterator = mySet.iterator();
      while (iterator.hasNext()) {
          System.out.println(iterator.next());
      }

      for (String word : mySet) {
          System.out.println(word);
      }
    }
}
