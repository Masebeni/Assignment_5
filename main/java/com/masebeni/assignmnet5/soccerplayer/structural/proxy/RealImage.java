package com.masebeni.assignmnet5.soccerplayer.structural.proxy;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public String display() {
        return "Displaying " + fileName;
    }

    private String loadFromDisk(String fileName) {
        return "Loading " + fileName;
    }
}
