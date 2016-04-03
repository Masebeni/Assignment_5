package com.masebeni.assignmnet5.soccerplayer.creational.builder;

/**
 * Created by Isiphile on 2016/04/03.
 */
public interface PizzaBuilder {
    public abstract void topping1();
    public abstract void topping2();
    public abstract void topping3();
    public abstract Pizza getPizza();
}
