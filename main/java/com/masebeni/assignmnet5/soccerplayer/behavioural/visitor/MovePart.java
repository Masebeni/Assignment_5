package com.masebeni.assignmnet5.soccerplayer.behavioural.visitor;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class MovePart implements BodyMovement {

    @Override
    public String movePart(Body body) {
        return "Moving body ";
    }

    @Override
    public String movePart(Arms arms) {
        return "Moving arms ";
    }

    @Override
    public String movePart(Legs legs) {
        return "Moving legs ";
    }
}