package com.masebeni.assignmnet5.soccerplayer.behavioural.observer;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Student1 implements Lecturer {

    @Override
    public String announce(String msg) {
        return "Student1: " + msg + "\n";
    }
}