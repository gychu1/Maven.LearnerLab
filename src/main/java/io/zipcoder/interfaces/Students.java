package io.zipcoder.interfaces;


import java.util.Arrays;

public class Students extends People<Student> { //Singleton

    private static final Students instance = new Students();

    private Students(){ //must be private in order to not be accessible
    }

    public static Students getInstance() {
        return instance;
    }

}
