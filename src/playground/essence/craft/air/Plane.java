package playground.essence.craft.air;

import playground.essence.Flyable;
import playground.essence.craft.Transportable;

public class Plane extends Aircraft implements Flyable, Transportable {
    public Plane(int mass, String name) {
        super(mass, name);
    }

    public void fly(String direction) {
        System.out.println("I am " + this.getClass().getSimpleName()
                + ", my name is " + name
                + " and I am flying to " + direction);
    }

    public void transport() {
    }
}
