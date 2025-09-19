package playground.essence.creatures;

public class Beetle extends Insect {
    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        if (this.mass < home.getMass()) {
            int family = home.getMass() / this.mass;
            System.out.printf("I am %s and I will nest there with %d my family members!%n", this.name, family);
        } else {
            System.out.printf("This carrot is too small for nesting :(%n");
        }
    }
}