package playground.processors;

import playground.essence.craft.Rideable;
import playground.utils.DirectionGenerator;

public class RideableProcessor {
    public void runRideable(Rideable rideable) {
        String randomDirection = DirectionGenerator.generateDirection();
        rideable.drive(randomDirection);
    }

    public void runRideable(Rideable rideable, String direction) {
        rideable.drive(direction);
    }
}
