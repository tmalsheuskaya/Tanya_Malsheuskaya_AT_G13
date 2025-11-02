package people.junit;

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
    public void testGetAge() {
        assertEquals(28, engineer.getAge());
    }

    @Test
    public void testSetAge() {
        engineer.setAge(31);
        assertEquals(31, engineer.getAge());
    }

    @Test
    public void testGetExperience() {
        assertEquals(3, engineer.getExperience());
    }

    @Test
    public void testSetExperience() {
        engineer.setExperience(5);
        assertEquals(5, engineer.getExperience());
    }

    @Test
    public void testGetSkill() {
        assertEquals(6, engineer.getSkill());
    }

    @Test
    public void testSetSkill() {
        engineer.setSkill(9);
        assertEquals(9, engineer.getSkill());
    }
}
