package com.company.task3.cars.econom;

public class Reno extends EconomCar{
    public Reno(int quantityFuel, int coast, String nameOfModel, int speed) {
        super(quantityFuel, coast, nameOfModel, speed);
    }

    @Override
    public String toString() {
        return "Logan " + super.toString();
    }
}
