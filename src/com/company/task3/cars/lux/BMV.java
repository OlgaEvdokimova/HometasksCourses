package com.company.task3.cars.lux;

public class BMV extends LuxCar{
    public BMV(int quantityFuel, int coast, String nameOfModel, int speed ) {
        super(quantityFuel, coast, nameOfModel, speed);
    }

    @Override
    public String toString() {
        return "BMV " + super.toString();
    }
}
