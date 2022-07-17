package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        String givenName = "GY";
        long givenID = 8;

        Person person = new Person(givenID, givenName);

        String retrievedName = person.getName();
        long retrievedID = person.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenID, retrievedID);
    }

    @Test
    public void testSetName() {
        String givenName = "GY";
        long givenID = 8;

        Person person = new Person(givenID, givenName);

        person.setName("Jenny");
        String retrievedName = person.getName();

        Assert.assertEquals("Jenny",retrievedName);

    }
}
