package people.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import playground.essence.people.AutomatedEngineer;

import static org.testng.AssertJUnit.assertEquals;

public class AutomatedEngineerTestNGTest {

    private AutomatedEngineer engineer;

    @BeforeMethod
    public void setEngineer() {
        engineer = new AutomatedEngineer(28, 5);
    }

    @Test
    public void testGetAge() {
        assertEquals(engineer.getAge(), 28);
    }

    @Test
    public void testSetAge() {
        engineer.setAge(30);
        assertEquals(engineer.getAge(), 30);
    }

    @Test
    public void testGetExperience() {
        assertEquals(engineer.getExperience(), 5);
    }

    @Test
    public void testSetExperience() {
        engineer.setExperience(6);
        assertEquals(engineer.getExperience(), 6);
    }

    @Test
    public void testGetSkill() {
        assertEquals(engineer.getSkill(), 15);
    }

    @Test
    public void testSetSkill() {
        engineer.setSkill(18);
        assertEquals(engineer.getSkill(), 18);
    }
}
