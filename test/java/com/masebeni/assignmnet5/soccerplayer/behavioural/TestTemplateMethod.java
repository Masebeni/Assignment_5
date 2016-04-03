package com.masebeni.assignmnet5.soccerplayer.behavioural;

import com.masebeni.assignmnet5.soccerplayer.behavioural.templatemethod.Car;
import com.masebeni.assignmnet5.soccerplayer.behavioural.templatemethod.Train;
import com.masebeni.assignmnet5.soccerplayer.behavioural.templatemethod.Transport;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class TestTemplateMethod {
    private Transport car = null;
    private Transport train = null;

    @Before
    public void setUp() {
        car = new Car();
        train = new Train();
    }

    @Test
    public void testCar() {
        Assert.assertEquals(true, car.start().equalsIgnoreCase("Start car"));
        Assert.assertEquals(true, car.energySource().equalsIgnoreCase("Petrol"));
        Assert.assertEquals(true, car.ride().equalsIgnoreCase("Energy source: Petrol, Start: Start car"));
    }

    @Test
    public void testTrain() {
        Assert.assertEquals(true, train.start().equalsIgnoreCase("Turbines on"));
        Assert.assertEquals(true, train.energySource().equalsIgnoreCase("Coal"));
        Assert.assertEquals(true, train.ride().equalsIgnoreCase("Energy source: Coal, Start: Turbines on"));
    }
}

