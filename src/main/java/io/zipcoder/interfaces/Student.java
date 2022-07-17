package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    double totalStudyTime = 0;

    Student(long id, String name) {
        super(id, name);
    }

    public void learn(double numberOfHours) {
        totalStudyTime = totalStudyTime + numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
