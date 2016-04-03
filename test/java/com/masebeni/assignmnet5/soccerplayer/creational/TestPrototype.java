package com.masebeni.assignmnet5.soccerplayer.creational;

import com.masebeni.assignmnet5.soccerplayer.creational.prototype.Audi;
import com.masebeni.assignmnet5.soccerplayer.creational.prototype.Benz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class TestPrototype {
    Benz benz1 = null;
    Benz benz2 = null;
    Audi audi1 = null;
    Audi audi2 = null;

    @Before
    public void setUp() {
        benz1 = new Benz("C200");
        benz2 = (Benz) benz1.copy();
      audi1 = new Audi("S7");
        audi2 = (Audi) audi1.copy();
    }

    @Test
    public void testBWM() {
        Assert.assertEquals(false, benz1.equals(benz2));
    }

    @Test
    public void testBMWOutput() {
        Assert.assertEquals(benz2.toString(), benz1.toString());
    }

    @Test
    public void testPorche() {
        Assert.assertEquals(false, audi1.equals(audi2));
    }

    @Test
    public void testPorcheOutput() {
        Assert.assertEquals(audi2.toString(), audi1.toString());
    }
}

