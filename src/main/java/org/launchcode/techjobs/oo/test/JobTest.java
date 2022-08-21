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


@Test

   public void  testSettingJobId() {
    Job test_job1= new Job();
    Job test_job2= new Job();
    assertNotEquals(test_job1.getId(),test_job2.getId());
}

@Test
    public void testJobConstructorSetsAllFields(){
    Job test_job3= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertTrue(test_job3 instanceof Job);
    assertTrue(test_job3.getEmployer() instanceof Employer);
    assertTrue(test_job3.getLocation() instanceof  Location);
    assertTrue(test_job3.getPositionType() instanceof PositionType);
    assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);
    assertEquals(test_job3.getName(), "Product tester");
    assertEquals(test_job3.getEmployer().getValue(), "ACME");
    assertEquals(test_job3.getLocation().getValue(), "Desert");
    assertEquals(test_job3.getPositionType().getValue(), "Quality control");
    assertEquals(test_job3.getCoreCompetency().getValue(), "Persistence");
}


@Test
    public void testJobsForEquality(){
    Job test_job3= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job test_job4= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(test_job3.equals(test_job4));
}

@Test
    public void testToStringStartsAndEndsWithNewLine(){
    Job test_job3= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals('\n', test_job3.toString().charAt(0)); //first character
    assertEquals('\n', test_job3.toString().charAt(test_job3.toString().length() -1)); //last character
}

@Test
    public void testToStringContainsCorrectLabelsAndData() {
    Job test_job3= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals("\nID: "+ test_job3.getId() + "\nName: " + test_job3.getName() +
            "\nEmployer: " + test_job3.getEmployer() +
            "\nLocation: " + test_job3.getLocation() +
            "\nPosition Type: " + test_job3.getPositionType() +
            "\nCore Competency: " + test_job3.getCoreCompetency() + "\n", test_job3.toString());
}

@Test
    public void testToStringHandlesEmptyField() {
    Job  test_job5= new Job("", new Employer(""),new Location(""), new PositionType(""), new CoreCompetency(""));
    assertEquals("\nID: "+ test_job5.getId() + "\nName: Data not available" +
            "\nEmployer: Data not available" +
            "\nLocation: Data not available" +
            "\nPosition Type: Data not available" +
            "\nCore Competency: Data not available" + "\n", test_job5.toString());
}

}
