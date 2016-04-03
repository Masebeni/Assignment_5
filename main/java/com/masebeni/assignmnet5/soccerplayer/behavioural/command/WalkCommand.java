package com.masebeni.assignmnet5.soccerplayer.behavioural.command;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class WalkCommand implements Command {

    Walk walk;

    public WalkCommand(Walk walk) {
        this.walk = walk;
    }

    @Override
    public String command() {
        return walk.walk();
    }
}