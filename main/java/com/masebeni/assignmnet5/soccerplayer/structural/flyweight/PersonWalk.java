package com.masebeni.assignmnet5.soccerplayer.structural.flyweight;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class PersonWalk implements Person {

    String move;

    public PersonWalk() {
        move = "Walk";
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String move() {
        return "Person: " + move;
    }
}