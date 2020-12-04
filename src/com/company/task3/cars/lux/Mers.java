package com.company.task3.cars.lux;

public class Mers extends LuxCar{
    public Mers(int quantityFuel, int coast, String nameOfModel, int speed) {
        super(quantityFuel, coast, nameOfModel, speed);
    }
    @Override
    public String toString() {
        return "Mers " + super.toString();
    }
}
