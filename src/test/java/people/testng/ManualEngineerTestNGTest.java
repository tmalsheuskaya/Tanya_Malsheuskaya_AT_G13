package people.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import playground.essence.people.ManualEngineer;

import static org.testng.AssertJUnit.assertEquals;

public class ManualEngineerTestNGTest {

    private ManualEngineer engineer;

    @BeforeMethod
    public void setEngineer() {
        engineer = new ManualEngineer(27, 4);
    }

    @Test
    public void testGetAge() {
        assertEquals(engineer.getAge(), 27);
    }

    @Test
    public void testSetAge() {
        engineer.setAge(30);
        assertEquals(engineer.getAge(), 30);
    }

    @Test
    public void testGetExperience() {
        assertEquals(engineer.getExperience(), 4);
    }

    @Test
    public void testSetExperience() {
        engineer.setExperience(5);
        assertEquals(engineer.getExperience(), 5);
    }

    @Test
    public void testGetSkill() {
        assertEquals(engineer.getSkill(), 8);
    }

    @Test
    public void testSetSkill() {
        engineer.setSkill(10);
        assertEquals(engineer.getSkill(), 10);
    }
}
