package io.zipcoder.interfaces;

public class Person {
    final long id;
    String name;

    Person (long id, String name) {
        this.id = id;
        this.name = name;
    }

    long getId() {
        return id;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add() {
    }
}
