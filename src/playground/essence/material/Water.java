package playground.essence.material;

import playground.essence.Matter;

public class Water extends Matter implements Pourable {
    public Water(int mass) {
        super(mass);
    }

    public void pour() {
    }
}
