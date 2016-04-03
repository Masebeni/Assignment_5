package com.masebeni.assignmnet5.soccerplayer.behavioural;

import com.masebeni.assignmnet5.soccerplayer.behavioural.iterator.Group;
import com.masebeni.assignmnet5.soccerplayer.behavioural.iterator.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class TestIterator {
    private Person person1 = null;
    private Person person2 = null;
    private Group group = null;
    private Iterator<Person> personIterator = null;

    @Before
    public void setUp() {
        person1 = new Person("Jarryd", 22);
        person2 = new Person("Bob", 67);
        group = new Group();
        personIterator = group.iterator();
    }

    @Test
    public void testAdd() {
        group.add(person1);
        Assert.assertEquals(person1, personIterator.next());
    }

    @Test
    public void testRemove() {
        group.add(person1);
        group.add(person2);
        personIterator = group.iterator();
        while(personIterator.hasNext()){
            personIterator.next();
        }
        personIterator.remove();
        personIterator = group.iterator();
        Assert.assertEquals(person1, personIterator.next());
    }
}

