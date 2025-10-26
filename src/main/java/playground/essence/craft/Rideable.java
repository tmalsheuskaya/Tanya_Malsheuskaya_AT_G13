package playground.essence.craft;

public interface Rideable {
    String getName();
    default void drive(String direction) {
        System.out.println("I am " + this.getClass().getSimpleName()
                + ", my name is " + getName()
                + " and I am driving to " + direction);
    }
}


