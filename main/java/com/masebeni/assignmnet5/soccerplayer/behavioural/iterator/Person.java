package com.masebeni.assignmnet5.soccerplayer.behavioural.iterator;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " +  age;
    }
}
