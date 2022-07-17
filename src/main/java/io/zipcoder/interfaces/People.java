package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class People<E> implements Iterable<E> {
    List<Person> personList = new ArrayList<Person>();


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

    public boolean remove(Person person) {
        return personList.remove(person);
    }

    public boolean remove(long id) {
        return personList.remove(findById(id));
    }

    public boolean removeAll() {
        return personList.removeAll(personList);
    }

    public int count() {
        return personList.size();
    }

    public Object[] toArray() {
       return personList.toArray();
    }

    public Iterator<E> iterator() {
        for( Person person : personList ){
            person.add();
        }
        return null;
    }
}
