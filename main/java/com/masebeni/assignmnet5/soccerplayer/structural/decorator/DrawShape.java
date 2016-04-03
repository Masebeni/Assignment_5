package com.masebeni.assignmnet5.soccerplayer.structural.decorator;

/**
 * Created by Isiphile on 2016/04/03.
 */
public abstract class DrawShape implements Shape{

    protected Shape shape;

    public DrawShape(Shape shape) {
        this.shape = shape;
    }

    public String draw() {
        return shape.draw();
    }
}

