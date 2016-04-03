package com.masebeni.assignmnet5.soccerplayer.structural.decorator;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class BigShape extends DrawShape {

    public BigShape(Shape shape) {
        super(shape);
    }

    @Override
    public String draw() {
        return shape.draw() + color(shape);
    }

    private String color(Shape shape) {
        return ": Red";
    }
}
