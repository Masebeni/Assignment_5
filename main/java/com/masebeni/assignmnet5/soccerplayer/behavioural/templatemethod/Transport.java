package com.masebeni.assignmnet5.soccerplayer.behavioural.templatemethod;

/**
 * Created by Isiphile on 2016/04/03.
 */
public abstract class Transport {

    public abstract String start();
    public abstract String energySource();

    public final String ride() {

        String str = "Energy source: " + energySource();
        str += ", Start: " + start();
        return str;
    }
}