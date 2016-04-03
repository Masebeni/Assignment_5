package com.masebeni.assignmnet5.soccerplayer.structural.bridge;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class SmallRectangle implements Draw{

    @Override
    public String drawRectangle(int height, int width) {
        return "Height: " + height + " Width: " + width;
    }
}
