package basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects run = new TrainMethodsObjects();

        Mouse mouse = new Mouse("Norushka", 9);
        run.processMouse(mouse);

        Souce souce = new Souce("mustard ", "orange");
        run.processSouce(souce);

        Bee bee = new Bee("female", 87);
        run.processBee(bee);

        Obstacle obstacle = new Obstacle("high", "low");
        run.processObstacle(obstacle);

        Pineapple pineapple = new Pineapple("some", 98);
        run.processPineapple(pineapple);
    }
}
