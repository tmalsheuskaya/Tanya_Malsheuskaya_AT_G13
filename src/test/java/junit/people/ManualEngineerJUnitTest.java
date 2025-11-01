package junit.people;

import org.junit.Before;
import org.junit.Test;
import playground.essence.people.ManualEngineer;

import static org.junit.Assert.*;

public class ManualEngineerJUnitTest {

    private ManualEngineer engineer;

    @Before
    public void setEngineer() {
        engineer = new ManualEngineer(28, 3);
    }

    @Test
    public void testConstructors() {
        assertEquals(28, engineer.getAge());
        assertEquals(3, engineer.getExperience());
        assertEquals(6, engineer.getSkill());
    }

    @Test
    public void testGettersSetters() {
        engineer.setAge(35);
        engineer.setExperience(5);
        engineer.setSkill(10);

        assertEquals(35, engineer.getAge());
        assertEquals(5, engineer.getExperience());
        assertEquals(10, engineer.getSkill());
    }
}
