package com.company.task3.cars.econom;

import com.company.task3.cars.Car;

public abstract class EconomCar extends Car {
    public EconomCar(int quantityFuel, int coast, String nameOfModel, int speed) {
        super(quantityFuel, coast, nameOfModel, speed);
    }

    @Override
    public String toString() {
        return "EconomCar" + super.toString();
    }
}
