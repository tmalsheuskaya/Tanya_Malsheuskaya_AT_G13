package project.boxing;

public class Bubble {
    private static final double Volume = 0.3;
    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    public double getVolume() {
        return Volume;
    }

    public String getGas() {
        return gas;
    }

    public void cramp() {
        System.out.println("Cramp!");
    }

}
