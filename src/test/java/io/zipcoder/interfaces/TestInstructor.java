package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(1, "XY");
        assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(1, "XY");
        assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(1, "XY");
        Student learner = new Student(8, "GY");
        instructor.teach(learner, 10);
        double actual = learner.getTotalStudyTime();

        Assert.assertEquals(10, actual, 0.1);
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(1, "XY");
        Student learner = new Student(8, "GY");
        Student learner2 = new Student(18, "GC");

        Learner[] learners = new Learner[] {
                learner, learner2
        };
        instructor.lecture(learners, 10);
        double actual = learner.getTotalStudyTime();

        Assert.assertEquals(5, actual, 0.1);
    }

}