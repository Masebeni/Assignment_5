package com.masebeni.assignmnet5.soccerplayer.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Factory {
    private static Factory factory;
    private Map<String, Person> people;

    private Factory() {
        people = new HashMap<String, Person>();
    }

    public static Factory getInstance() {
        if(factory == null) {
            factory = new Factory();
        }
        return factory;
    }

    public Person getPerson(String key) {
        if(people.containsKey(key)) {
            return people.get(key);
        } else {
            Person person;
            if("Run".equalsIgnoreCase(key)) {
                person = new PersonRun();
            } else {
                person = new PersonWalk();
            }
            people.put(key, person);
            return person;
        }
    }
}

