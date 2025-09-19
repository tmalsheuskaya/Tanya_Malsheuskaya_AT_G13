package playground.essence.material;

import playground.essence.Matter;

public class Petrol extends Matter implements Pourable, Powerable {
    public Petrol(int mass) {
        super(mass);
    }

    public void pour() {
    }

    public void power() {
    }
}

