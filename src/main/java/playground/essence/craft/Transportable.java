package playground.essence.craft;

public interface Transportable {
    default int move(int pointA, int pointB) {
        System.out.printf("I am %s and I am moving from %d to %d%n",
                this.getClass().getSimpleName(), pointA, pointB);
        return pointB - pointA;
    }
}