package com.masebeni.assignmnet5.soccerplayer.behavioural.chainofresponsibility;

/**
 * Created by Isiphile on 2016/04/03.
 */
public abstract class Team {
    Team team;

    public void setTeam(Team team) {
        this.team = team;
    }

    public abstract String team(FootballPositions position);
}
