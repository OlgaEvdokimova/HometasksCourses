package com.company.task3.cars.lux;

import com.company.task3.cars.Car;

public abstract class LuxCar extends Car {
    public LuxCar(int quantityFuel, int coast, String nameOfModel, int speed) {
        super(quantityFuel, coast, nameOfModel, speed);
    }

    @Override
    public String toString() {
        return "LuxCar " + super.toString();
    }
}
