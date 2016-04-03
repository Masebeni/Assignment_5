package com.masebeni.assignmnet5.soccerplayer.structural;

import com.masebeni.assignmnet5.soccerplayer.structural.flyweight.Factory;
import com.masebeni.assignmnet5.soccerplayer.structural.flyweight.Person;
import com.masebeni.assignmnet5.soccerplayer.structural.flyweight.PersonRun;
import com.masebeni.assignmnet5.soccerplayer.structural.flyweight.PersonWalk;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class TestFlyweight {
    private Factory factory = null;
    private Person person1;
    private Person person2;

    @Before
    public void setUp() {
        factory = Factory.getInstance();
        person1 = new PersonRun();
        person2 = new PersonWalk();
    }

    @Test
    public void testPersonRun() {
        Assert.assertEquals(true, person1.move().equalsIgnoreCase("Person: Run"));
    }

    @Test
    public void testPersonWalk() {
        Assert.assertEquals(true, person2.move().equalsIgnoreCase("Person: Walk"));
    }

    @Test
    public void testFactoryGetPerson() {
        Person person3 = factory.getPerson("Run");
        Assert.assertEquals(true, factory.getPerson("Run").equals(person3));
    }
}

