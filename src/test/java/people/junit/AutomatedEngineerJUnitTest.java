package people.junit;

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
    public void testGetAge() {
        assertEquals(30, engineer.getAge());
    }

    @Test
    public void testSetAge() {
        engineer.setAge(35);
        assertEquals(35, engineer.getAge());
    }

    @Test
    public void testGetExperience() {
        assertEquals(6, engineer.getExperience());
    }

    @Test
    public void testSetExperience() {
        engineer.setExperience(5);
        assertEquals(5, engineer.getExperience());
    }

    @Test
    public void testGetSkill() {
        assertEquals(18, engineer.getSkill());
    }

    @Test
    public void testSetSkill() {
        engineer.setSkill(9);
        assertEquals(9, engineer.getSkill());
    }
}
