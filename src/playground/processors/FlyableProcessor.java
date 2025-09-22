package playground.processors;

import playground.essence.Flyable;
import playground.utils.DirectionGenerator;

public class FlyableProcessor {

    public void runFlyable(Flyable flyable) {
        String randomDirection = DirectionGenerator.generateDirection();
        flyable.fly(randomDirection);
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.fly(direction);
    }
}
