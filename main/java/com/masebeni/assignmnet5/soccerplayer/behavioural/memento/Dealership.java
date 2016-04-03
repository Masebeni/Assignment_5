package com.masebeni.assignmnet5.soccerplayer.behavioural.memento;

/**
 * Created by Isiphile on 2016/04/03.
 */
public class Dealership {
    private String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Car car() {
        return new Car(manufacturer);
    }

    public void getCar(Car car) {
        manufacturer = car.getManufacturer();
    }
}
