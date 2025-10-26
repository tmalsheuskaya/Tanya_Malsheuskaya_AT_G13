package project.boxing;

import java.util.ArrayList;
import java.util.List;

public class SparklingWater extends Water {
    private List<Bubble> bubbles = new ArrayList<>();

    public SparklingWater(String color, String transparency, String smell, double temperature) {
        super(color, transparency, smell, temperature);
    }

    public void saturate(Bubble[] bubblesArray) {
        for (Bubble b : bubblesArray) {
            bubbles.add(b);
        }
    }

    public void degas() {
        while (!bubbles.isEmpty()) {
            Bubble b = bubbles.remove(0);
            b.cramp();
        }
    }
}
