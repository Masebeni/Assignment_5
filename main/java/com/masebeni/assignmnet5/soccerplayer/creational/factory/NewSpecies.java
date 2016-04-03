package com.masebeni.assignmnet5.soccerplayer.creational.factory;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class NewSpecies {
    public Species getSpecies(String type){
        if(type.equalsIgnoreCase("Human")){
            return new Human();
        } else {
            return new Fish();
        }
    }
}