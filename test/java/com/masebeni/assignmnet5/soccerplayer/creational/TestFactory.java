package com.masebeni.assignmnet5.soccerplayer.creational;

import com.masebeni.assignmnet5.soccerplayer.creational.factory.NewSpecies;
import com.masebeni.assignmnet5.soccerplayer.creational.factory.Species;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by Isiphile on 2016/04/03.
 */
public class TestFactory {
    NewSpecies createSpecies = null;
    Species species1 = null;
    Species species2 = null;

    @Before
    public void setUp(){
        createSpecies = new NewSpecies();
        species1 = createSpecies.getSpecies("Human");
        species2 = createSpecies.getSpecies("Fish");
    }

    @Test
    public void testSpecies1Move(){
        Assert.assertEquals("Walk", species1.move());
    }

    @Test
    public void testSpecies2Move(){
        Assert.assertEquals("Swim", species2.move());
    }

    @Test
    public void testObjectsEquality(){
        Assert.assertEquals(false, species1.equals(species2));
    }
}

