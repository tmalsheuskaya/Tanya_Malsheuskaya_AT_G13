package project.boxing;

public class Bottle {
    private double volume;
    private SparklingWater water;

    public Bottle(double volume) {
        this.volume = volume;
        this.water = new SparklingWater("transparent", "clear", "no smell", 30);

        int bubblesCount = (int)(volume * 10000);
        Bubble[] bubbles = new Bubble[bubblesCount];
        for (int i = 0; i < bubblesCount; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        water.saturate(bubbles);
    }

    public void open() {
        System.out.println(("Bottle " + volume + " L opened"));
        water.degas();
    }
}
