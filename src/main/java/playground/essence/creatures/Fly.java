package playground.essence.creatures;

import playground.essence.Flyable;

public class Fly extends Insect implements Flyable {
    public Fly(int mass, String name) {
        super(mass, name);
    }

    public void fly(String direction) {
        System.out.println("I am " + this.getClass().getSimpleName()
                + ", my name is " + name
                + " and I am flying to " + direction);
    }
}
