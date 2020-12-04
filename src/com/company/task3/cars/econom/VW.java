package com.company.task3.cars.econom;

public class VW extends EconomCar{
    public VW(int quantityFuel, int coast, String nameOfModel, int speed) {
        super(quantityFuel, coast, nameOfModel,  speed);
    }

    @Override
    public String toString() {
        return "Polo " + super.toString();
    }
}
