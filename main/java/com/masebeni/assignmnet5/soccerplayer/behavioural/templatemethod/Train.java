package com.masebeni.assignmnet5.soccerplayer.behavioural.templatemethod;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Train extends Transport {

    @Override
    public String start() {
        return "Turbines on";
    }

    @Override
    public String energySource() {
        return "Coal";
    }
}