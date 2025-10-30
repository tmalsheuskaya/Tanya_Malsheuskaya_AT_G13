package testng.people;

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
    public void testConstructors() {
        assertEquals(engineer.getAge(), 28);
        assertEquals(engineer.getExperience(), 5);
        assertEquals(engineer.getSkill(), 15);
    }

    @Test
    public void testGettersSetters() {
        engineer.setAge(30);
        engineer.setExperience(6);
        engineer.setSkill(18);

        assertEquals(engineer.getAge(), 30);
        assertEquals(engineer.getExperience(), 6);
        assertEquals(engineer.getSkill(), 18);
    }
}
