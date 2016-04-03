package com.masebeni.assignmnet5.soccerplayer.structural.bridge;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle(int height, int width, Draw draw) {
        super(draw);
        this.height = height;
        this.width = width;
    }

    @Override
    public String draw() {
        return draw.drawRectangle(height, width);
    }
}