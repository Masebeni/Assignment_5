package com.masebeni.assignmnet5.soccerplayer.creational.prototype;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Audi implements Prototype {

    private String model;

    public Audi(String model) {
        this.model = model;
    }

    @Override
    public Prototype copy() {
        return new Audi(model);
    }

    public String toString() {
        return "Audi model: " + model;
    }
}
