package com.masebeni.assignmnet5.soccerplayer.behavioural.templatemethod;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Car extends Transport {

    @Override
    public String start() {
        return "Start car";
    }

    @Override
    public String energySource() {
        return "Petrol";
    }
}
