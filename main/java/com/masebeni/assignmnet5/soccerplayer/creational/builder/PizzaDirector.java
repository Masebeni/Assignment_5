package com.masebeni.assignmnet5.soccerplayer.creational.builder;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class PizzaDirector {

    private PizzaBuilder pizzaBuilder = null;

    public PizzaDirector(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void makePizza() {
        pizzaBuilder.topping1();
        pizzaBuilder.topping2();
        pizzaBuilder.topping3();
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }
}
