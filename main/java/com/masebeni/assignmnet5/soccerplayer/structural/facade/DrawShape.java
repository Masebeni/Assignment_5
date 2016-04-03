package com.masebeni.assignmnet5.soccerplayer.structural.facade;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class DrawShape {
    private Shape rectangle;
    private Shape square;

    public DrawShape() {
        rectangle = new Rectangle();
        square = new Square();
    }

    public String drawRectangle() {
        return rectangle.draw();
    }

    public String drawSquare() {
        return square.draw();
    }
}

