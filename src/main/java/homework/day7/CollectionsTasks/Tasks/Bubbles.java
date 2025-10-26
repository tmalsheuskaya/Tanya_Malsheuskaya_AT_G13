package homework.day7.CollectionsTasks.Tasks;

import homework.day7.CollectionsTasks.PreparedClasses.Bubble;

import java.util.Arrays;
import java.util.List;

public class Bubbles {
    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO")
        );

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
        }
        System.out.println();

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }
        System.out.println();

        int totalVolume = 0;
        for (Bubble bubble : bubbles) {
            totalVolume += bubble.getVolume();
        }
        System.out.println(totalVolume);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i));
        }
    }
}
