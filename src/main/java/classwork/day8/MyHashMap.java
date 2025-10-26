package classwork.day8;

import java.util.HashMap;
import java.util.Map;


public class MyHashMap {
    public static void main(String[] args) {

        String[] array = "мама мыла раму мыла".split(" ");
        Map<Integer, String> words = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
        }

        for (int word : words.keySet()) {
            System.out.println(word);
        }

        for (String value : words.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, String> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
