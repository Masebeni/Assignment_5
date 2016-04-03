package com.masebeni.assignmnet5.soccerplayer.behavioural.mediator;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        return Speak.hello(name);
    }

    public String sayGoodbye() {
        return Speak.goodbye(name);
    }
}