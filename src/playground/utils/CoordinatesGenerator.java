package playground.utils;

import java.util.Random;

public class CoordinatesGenerator {
    private static final Random random = new Random();

    public static int generateCoordinate() {
        int coordinate = 1 + random.nextInt(79);
        System.out.printf("CoordinatesGenerator: I have generated point with value: " + coordinate);
        return coordinate;
    }
}
