package playground.essence.material;

import playground.essence.Matter;

public class Diesel extends Matter implements Pourable, Powerable {
    public Diesel(int mass) {
        super(mass);
    }

    public void pour() {
    }

    public void power() {
    }
}
