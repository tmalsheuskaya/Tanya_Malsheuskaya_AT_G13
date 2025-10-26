package playground.essence.creatures;

import java.io.Serializable;

public abstract class Insect extends Animal implements Serializable {
    private static final long serialVersionUID = 1L;
    public Insect(int mass, String name) {
        super(mass, name);
    }
    public Insect() {
        super(0,"");
    };
}
