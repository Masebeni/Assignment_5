package com.masebeni.assignmnet5.soccerplayer.creational.singleton;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Cat {

    private static Cat cat = null;

    private Cat(){

    }

    public static Cat getInstance(){
        if(cat == null)
        {
            cat = new Cat();
        }
        return cat;
    }

    public String meow(){
        return "Meowing";
    }
}