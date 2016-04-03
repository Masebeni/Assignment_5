package com.masebeni.assignmnet5.soccerplayer.creational.abstractfactory;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class LandFactory extends TransportFactory {

    public Machine getMachine(String type) {
        return new Car();
    }
}
