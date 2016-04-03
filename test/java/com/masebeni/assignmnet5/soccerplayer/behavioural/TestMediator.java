package com.masebeni.assignmnet5.soccerplayer.behavioural;

import com.masebeni.assignmnet5.soccerplayer.behavioural.mediator.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class TestMediator {
    private Person person1 = null;
    private Person person2 = null;

    @Before
    public void setUp() {
        person1 = new Person("Jarryd");
        person2 = new Person("Deane");
    }

    @Test
    public void testPerson1Hello() {
        Assert.assertEquals(true, person1.sayHello().equalsIgnoreCase("Hello Jarryd"));
    }

    @Test
    public void testPerson1Goodbye() {
        Assert.assertEquals(true, person1.sayGoodbye().equalsIgnoreCase("Goodbye Jarryd"));
    }

    @Test
    public void testPerson2Hello() {
        Assert.assertEquals(true, person2.sayHello().equalsIgnoreCase("Hello Deane"));
    }

    @Test
    public void testPerson2Goodbye() {
        Assert.assertEquals(true, person2.sayGoodbye().equalsIgnoreCase("Goodbye Deane"));
    }
}

