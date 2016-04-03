package com.masebeni.assignmnet5.soccerplayer.structural.composite;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Vehicle implements Component {

    String car;

    public Vehicle(String car) {
        this.car = car;
    }

    @Override
    public String accelerate() {
        return car + " accelerating";
    }

    @Override
    public String brake() {
        return car + " braking";
    }
}
