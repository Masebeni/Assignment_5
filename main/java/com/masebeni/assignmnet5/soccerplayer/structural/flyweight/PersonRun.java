package com.masebeni.assignmnet5.soccerplayer.structural.flyweight;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class PersonRun implements Person {

    String move;

    public PersonRun() {
        move = "Run";
        try {
            Thread.sleep(500);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String move() {
        return "Person: " + move;
    }
}