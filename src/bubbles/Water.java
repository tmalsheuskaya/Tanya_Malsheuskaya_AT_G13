package bubbles;

public abstract class Water {
    protected String color;
    protected String transparency;
    protected String smell;
    protected double temperature;

    public Water(String color, String transparency, String smell, double temperature) {
        this.color = color;
        this.transparency = transparency;
        this.smell = smell;
        this.temperature = temperature;
    }
}
