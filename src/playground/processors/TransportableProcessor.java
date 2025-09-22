package playground.processors;

import playground.utils.CoordinatesGenerator;
import playground.essence.craft.Transportable;

public class TransportableProcessor {
    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int distance = transportable.move(pointA, pointB);
        System.out.printf("Transportable %s was moved to %d points%n",
                transportable.getClass().getSimpleName(), distance);
    }

    public void runTransportable(Transportable transportable) {
        int pointA = CoordinatesGenerator.generateCoordinate();
        int pointB = CoordinatesGenerator.generateCoordinate();
        int distance = transportable.move(pointA, pointB);
        System.out.printf("Transportable %s was moved to %d points%n",
                transportable.getClass().getSimpleName(), distance);
    }
}
