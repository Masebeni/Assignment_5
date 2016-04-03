package com.masebeni.assignmnet5.soccerplayer.creational.abstractfactory;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class AbstractFactory {
    public TransportFactory getTransportFactory(String type) {
        if(type.equalsIgnoreCase("Land")) {
            return new LandFactory();
        } else {
            return new AirFactory();
        }
    }
}
