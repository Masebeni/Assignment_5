package com.masebeni.assignmnet5.soccerplayer.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Created by Isiphile on 2016/04/03.
 */
public class Group {
    List<Person> personList;

    public Group() {
        personList = new ArrayList<Person>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Iterator<Person> iterator() {
        return new Iterate();
    }

    public int ListSize() {
        return personList.size();
    }

    class Iterate implements Iterator<Person> {

        int index = 0;

        @Override
        public boolean hasNext() {
            if(index >= personList.size()) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Person next() {
            return personList.get(index++);
        }

        @Override
        public void remove() {
            personList.remove(--index);
        }
    }
}
