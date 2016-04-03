package com.masebeni.assignmnet5.soccerplayer.creational.builder;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class SouthAfricanPizza implements PizzaBuilder {

    private Pizza pizza;

    public SouthAfricanPizza() {
        pizza = new Pizza();
    }

    @Override
    public void topping1() {
        pizza.setTopping1("Steak");
    }

    @Override
    public void topping2() {
        pizza.setTopping2("Cheese");
    }

    @Override
    public void topping3() {
        pizza.setTopping3("Gherkins");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}