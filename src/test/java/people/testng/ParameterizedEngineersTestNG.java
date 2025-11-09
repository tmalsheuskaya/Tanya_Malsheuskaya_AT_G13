package people.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import playground.essence.people.AutomatedEngineer;
import playground.essence.people.Engineer;
import playground.essence.people.ManualEngineer;

public class ParameterizedEngineersTestNG {

    private Engineer engineer;

    @BeforeMethod
    public void setUp() {
    }

    @DataProvider(name = "engineers")
    public Object[][] provideEngineers() {
        return new Object[][]{
                {ManualEngineer.class, 25, 2, 4},
                {AutomatedEngineer.class, 30, 5, 15}
        };
    }

    @Test(dataProvider = "engineers")
    public void testAgeGetter(Class<? extends Engineer> engineerClass, int age, int experience, int expectedSkill) throws Exception {
        engineer = engineerClass.getDeclaredConstructor(int.class, int.class).newInstance(age, experience);
        Assert.assertEquals(engineer.getAge(), age, "Age getter should return correct age");
    }

    @Test(dataProvider = "engineers")
    public void testExperienceGetter(Class<? extends Engineer> engineerClass, int age, int experience, int expectedSkill) throws Exception {
        engineer = engineerClass.getDeclaredConstructor(int.class, int.class).newInstance(age, experience);
        Assert.assertEquals(engineer.getExperience(), experience, "Experience getter should return correct experience");
    }

    @Test(dataProvider = "engineers")
    public void testSkillCalculation(Class<? extends Engineer> engineerClass, int age, int experience, int expectedSkill) throws Exception {
        engineer = engineerClass.getDeclaredConstructor(int.class, int.class).newInstance(age, experience);
        Assert.assertEquals(engineer.getSkill(), expectedSkill, "Skill calculation should match expected value");
    }

    @Test(dataProvider = "engineers")
    public void testSetAge(Class<? extends Engineer> engineerClass, int age, int experience, int expectedSkill) throws Exception {
        engineer = engineerClass.getDeclaredConstructor(int.class, int.class).newInstance(age, experience);
        engineer.setAge(40);
        Assert.assertEquals(engineer.getAge(), 40, "setAge should correctly update the age");
    }

    @Test(dataProvider = "engineers")
    public void testSetExperience(Class<? extends Engineer> engineerClass, int age, int experience, int expectedSkill) throws Exception {
        engineer = engineerClass.getDeclaredConstructor(int.class, int.class).newInstance(age, experience);
        engineer.setExperience(10);
        Assert.assertEquals(engineer.getExperience(), 10, "setExperience should correctly update the experience");
    }

    @Test(dataProvider = "engineers")
    public void testSetSkill(Class<? extends Engineer> engineerClass, int age, int experience, int expectedSkill) throws Exception {
        engineer = engineerClass.getDeclaredConstructor(int.class, int.class).newInstance(age, experience);
        engineer.setSkill(15);
        Assert.assertEquals(engineer.getSkill(), 15, "setSkill should correctly update the skill");
    }
}
