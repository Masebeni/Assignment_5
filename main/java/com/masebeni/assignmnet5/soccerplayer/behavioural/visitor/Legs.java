package com.masebeni.assignmnet5.soccerplayer.behavioural.visitor;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Legs implements BodyPart {

    @Override
    public String move(BodyMovement bodyMovement) {
        return bodyMovement.movePart(this);
    }
}
