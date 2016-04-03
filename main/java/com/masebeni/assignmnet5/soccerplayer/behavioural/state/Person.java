package com.masebeni.assignmnet5.soccerplayer.behavioural.state;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Person implements Action {

    Action action;

    public Person(Action action) {
        this.action = action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    @Override
    public String move() {
        return action.move();
    }
}