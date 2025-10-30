package testng.people;

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
    public void testConstructors() {
        assertEquals(engineer.getAge(), 27);
        assertEquals(engineer.getExperience(), 4);
        assertEquals(engineer.getSkill(), 8);
    }

    @Test
    public void testGettersSetters() {
        engineer.setAge(30);
        engineer.setExperience(6);
        engineer.setSkill(12);

        assertEquals(engineer.getAge(), 30);
        assertEquals(engineer.getExperience(), 6);
        assertEquals(engineer.getSkill(), 12);
    }
}
