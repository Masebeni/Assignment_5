package com.masebeni.assignmnet5.soccerplayer.behavioural;

import com.masebeni.assignmnet5.soccerplayer.behavioural.state.Danger;
import com.masebeni.assignmnet5.soccerplayer.behavioural.state.Person;
import com.masebeni.assignmnet5.soccerplayer.behavioural.state.Safe;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class TestState {
    private Person person1 = null;
    private Person person2 = null;

    @Before
    public void setUp() {
        person1 = new Person(new Danger());
        person2 = new Person(new Safe());
    }

    @Test
    public void testPerson1() {
        Assert.assertEquals(true, person1.move().equalsIgnoreCase("RUN!"));
    }

    @Test
    public void testPerson2() {
        Assert.assertEquals(true, person2.move().equalsIgnoreCase("Walk"));
    }
}
