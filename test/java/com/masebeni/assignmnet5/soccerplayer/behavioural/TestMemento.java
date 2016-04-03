package com.masebeni.assignmnet5.soccerplayer.behavioural;

import com.masebeni.assignmnet5.soccerplayer.behavioural.memento.Dealer;
import com.masebeni.assignmnet5.soccerplayer.behavioural.memento.Dealership;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class TestMemento {
    private Dealership dealership = null;
    private Dealer dealer = null;

    @Before
    public void setUp() {
        dealership = new Dealership();
        dealer = new Dealer();
    }

    @Test
    public void testDealershipAdd() {
        dealership.setManufacturer("Porche");
        dealer.add(dealership.car());
        Assert.assertEquals(true, dealership.getManufacturer().equalsIgnoreCase("Porche"));
    }

    @Test
    public void test() {
        dealership.setManufacturer("Toyota");
        dealer.add(dealership.car());
        dealership.getCar(dealer.getCar(0));
        Assert.assertEquals(true, dealership.getManufacturer().equalsIgnoreCase("Toyota"));
    }

}

