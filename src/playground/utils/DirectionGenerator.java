package playground.utils;

import java.util.Random;

public class DirectionGenerator {

    public static String generateDirection() {
        Random random = new Random();
        int number = random.nextInt(39) + 1; // от 1 до 39 включительно

        if (number >= 1 && number <= 9) {
            return "NORTH";
        } else if (number >= 10 && number <= 19) {
            return "SOUTH";
        } else if (number >= 20 && number <= 29) {
            return "WEST";
        } else { // 30–39
            return "EAST";
        }
    }
}
