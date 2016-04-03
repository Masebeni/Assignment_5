package com.masebeni.assignmnet5.soccerplayer.structural.bridge;

/**
 * Created by Isiphile on 2016/04/03.
 */
public abstract class Shape {
    protected Draw draw;

    protected Shape(Draw draw) {
        this.draw = draw;
    }

    public abstract String draw();
}