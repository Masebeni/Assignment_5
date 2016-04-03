package com.masebeni.assignmnet5.soccerplayer.behavioural.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Dealer {
    private List<Car> carList = new ArrayList<Car>();

    public void add(Car car) {
        carList.add(car);
    }

    public Car getCar(int index) {
        return carList.get(index);
    }
}

