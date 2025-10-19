package playground.utils;

import java.util.Random;

public class DistanceGenerator {
    public static int generateDistance() {
        Random random = new Random();
        int num = random.nextInt(100);
        System.out.println("DistanceGenerator: I have generated distance with value: " + num);
        return num;
    }
}
