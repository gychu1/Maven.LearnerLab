package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class People<E> implements Iterable<E> {
    List<Person> personList;

    public People() {
        personList = new ArrayList<Person>();
    }
    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person) {
        return personList.contains(person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove(long id) {
//        personList.remove(findById(id));
        for (Person person : personList) {
            if (person.getId() == id) {
                personList.remove(person);
            }
        }
    }

    public void removeAll() {
         personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Object[] toArray() { //not sure
        //The class should define a method named toArray which returns an array representation of the personList field.
       return personList.toArray();
    }

    public Iterator<E> iterator() { //not sure
        for( Person person : personList ){
            person.add();
        }
        return null;
    }
}
