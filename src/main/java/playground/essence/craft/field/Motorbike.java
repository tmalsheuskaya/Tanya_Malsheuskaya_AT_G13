package playground.essence.craft.field;

import playground.essence.craft.Rideable;
import playground.essence.craft.Transportable;

public class Motorbike extends Vehicle implements Transportable, Rideable {
    public Motorbike(int mass, String name) {
        super(mass, name);
    }

    public int move(int pointA, int pointB) {
        System.out.printf("I am %s, my name is %s and I am moving from point %d to point %d%n",
                this.getClass().getSimpleName(), this.getName(), pointA, pointB);
        return pointB - pointA;
    }

    public void ride() {
    }
}
