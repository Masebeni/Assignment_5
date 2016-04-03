package com.masebeni.assignmnet5.soccerplayer.behavioural.state;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Danger implements Action {

    @Override
    public String move() {
        return "RUN!";
    }
}