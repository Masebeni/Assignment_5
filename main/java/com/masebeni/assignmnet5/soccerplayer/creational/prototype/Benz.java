package com.masebeni.assignmnet5.soccerplayer.creational.prototype;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Benz implements Prototype{

    private String model;

    public Benz(String model) {
        this.model = model;
    }

    @Override
    public Prototype copy() {
        return new Benz(model);
    }

    public String toString() {
        return "Benz model: " + model;
    }
}