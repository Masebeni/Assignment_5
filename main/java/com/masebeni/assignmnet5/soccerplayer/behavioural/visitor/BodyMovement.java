package com.masebeni.assignmnet5.soccerplayer.behavioural.visitor;

/**
 * Created by Isiphile on 2016/04/03.
 */
public interface BodyMovement {
    public abstract String movePart(Body body);
    public abstract String movePart(Arms arms);
    public abstract String movePart(Legs legs);
}
