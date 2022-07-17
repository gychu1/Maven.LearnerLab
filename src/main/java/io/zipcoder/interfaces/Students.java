package io.zipcoder.interfaces;


public class Students { //Singleton

    private static final Students instance = new Students();

    private Students(){ //must be private in order to not be accessible
    }

    public static Students getInstance() {
        return instance;
    }
}
