package com.masebeni.assignmnet5.soccerplayer.behavioural.strategy;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class NormalPass implements TestScore {

    @Override
    public boolean testScore(int score) {

        if(score < 75) {
            return true;
        } else {
            return false;
        }
    }
}