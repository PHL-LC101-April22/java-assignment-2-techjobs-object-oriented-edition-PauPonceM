package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
Job test_job1;
Job test_job2;
Job test_job3;
Job test_job4;


@Before
public void createJobObject(){
    test_job1 = new Job();
    test_job2 = new Job();
    test_job3= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    test_job4= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
}
@Test
   public void  testSettingJobId() {
    assertNotEquals(test_job1.getId(),test_job2.getId());
}

@Test
    public void testJobConstructorSetsAllFields(){
    assertTrue(test_job3 instanceof Job);
    assertTrue(test_job3.getEmployer() instanceof Employer);
    assertTrue(test_job3.getLocation() instanceof  Location);
    assertTrue(test_job3.getPositionType() instanceof PositionType);
    assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);
    assertEquals(test_job3.getName(), "Product tester");
    assertEquals(test_job3.getEmployer(), "ACME");
    assertEquals(test_job3.getLocation(), "Desert");
    assertEquals(test_job3.getPositionType(), "Quality control");
    assertEquals(test_job3.getCoreCompetency(), "Persistence");
}


@Test
    public void testJobsForEquality(){
    assertFalse(test_job3.equals(test_job4));
}

@Test
    public void testToStringStartsAndEndsWithNewLine(){
    assertEquals("\n", test_job3.toString().charAt(0));
}



}
