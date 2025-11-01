package junit.people;

import org.junit.Before;
import org.junit.Test;
import playground.essence.people.AutomatedEngineer;
import static org.junit.Assert.*;

public class AutomatedEngineerJUnitTest {

    private AutomatedEngineer engineer;

    @Before
    public void setEngineer() {
        engineer = new AutomatedEngineer(30, 6);
    }

    @Test
    public void testConstructors() {
        assertEquals(30, engineer.getAge());
        assertEquals(6, engineer.getExperience());
        assertEquals(18, engineer.getSkill());
    }

    @Test
    public void testGettersSetters() {
        engineer.setAge(35);
        engineer.setExperience(5);
        engineer.setSkill(15);

        assertEquals(35, engineer.getAge());
        assertEquals(5, engineer.getExperience());
        assertEquals(15, engineer.getSkill());
    }
}
