package classwork.day7;

import java.util.ArrayList;
import java.util.List;

public class NeArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        String str = "мама мыла раму мыла";
        String[] words = str.split(" ");
        for (String word : words) {
            list.add(word);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String word : list) {
            System.out.println(word);
        }
    }
}
