package people.junit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import playground.essence.people.AutomatedEngineer;
import playground.essence.people.Engineer;
import playground.essence.people.ManualEngineer;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class ParameterizedEngineersJUnit {

    private Engineer engineer;
    private final Class<? extends Engineer> engineerClass;
    private final int age;
    private final int experience;
    private final int expectedSkill;

    public ParameterizedEngineersJUnit(Class<? extends Engineer> engineerClass, int age, int experience, int expectedSkill) {
        this.engineerClass = engineerClass;
        this.age = age;
        this.experience = experience;
        this.expectedSkill = expectedSkill;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> engineers() {
        return Arrays.asList(new Object[][]{
                {ManualEngineer.class, 25, 2, 4},
                {AutomatedEngineer.class, 30, 5, 15}
        });
    }

    @Before
    public void setUp() {
        if (engineerClass.equals(AutomatedEngineer.class)) {
            engineer = new AutomatedEngineer(age, experience);
        } else if (engineerClass.equals(ManualEngineer.class)) {
            engineer = new ManualEngineer(age, experience);
        }
    }


    @Test
    public void testAgeGetter() {
        assertEquals("Age getter should return correct age", age, engineer.getAge());
    }

    @Test
    public void testExperienceGetter() {
        assertEquals("Experience getter should return correct experience", experience, engineer.getExperience());
    }

    @Test
    public void testSkillCalculation() {
        assertEquals("Skill calculation should match expected value", expectedSkill, engineer.getSkill());
    }

    @Test
    public void testSetAge() {
        engineer.setAge(40);
        assertEquals("setAge should correctly update the age", 40, engineer.getAge());
    }

    @Test
    public void testSetExperience() {
        engineer.setExperience(10);
        assertEquals("setExperience should correctly update the experience", 10, engineer.getExperience());
    }

    @Test
    public void testSetSkill() {
        engineer.setSkill(15);
        assertEquals(15, engineer.getSkill());
    }
}
