package com.masebeni.assignmnet5.soccerplayer.behavioural.chainofresponsibility;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Defender extends Team {
    @Override
    public String team(FootballPositions position) {
        String str = null;

        if(position == FootballPositions.DEFENDER) {
            return "Defender ";
        } else {
            if(team != null) {
                str = team.team(position);
            }
            return "Not Defender " + str;
        }
    }
    public String toString(String string) {
        return string;
    }
}
