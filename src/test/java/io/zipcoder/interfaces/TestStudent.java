package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudent {



    @Test
    public void testImplementation() {
        String name = "GY";
        long id = 8;

        Student student = new Student(id, name);
        assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        String name = "GY";
        long id = 8;

        Student student = new Student(id, name);
        assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        String name = "GY";
        long id = 8;

        Student student = new Student(id, name);

        double numberOfHours = 5;
        student.learn(numberOfHours);

        double actual = student.getTotalStudyTime();

        Assert.assertEquals(numberOfHours, actual, 0.1);
    }

}