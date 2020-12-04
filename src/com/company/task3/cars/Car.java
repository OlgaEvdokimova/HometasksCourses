package com.company.task3.cars;

import java.util.Objects;

public abstract class Car {//implements Comparable<Car>{
    private int fuelFlow;
    private int coast;
    private String nameOfModel;
    private int speed;

    public Car(int fuelFlow, int coast, String nameOfModel, int speed) {
        this.fuelFlow = fuelFlow;
        this.coast = coast;
        this.nameOfModel = nameOfModel;
        this.speed = speed;
    }

//    @Override
//    public int compareTo(Car o) {
//        return this.getQuantityFuel() - o.getQuantityFuel();
//    }

    public int getFuelFlow() {
        return fuelFlow;
    }

    public void setFuelFlow(int fuelFlow) {
        this.fuelFlow = fuelFlow;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    public String getNameOfModel() {
        return nameOfModel;
    }

    public void setNameOfModel(String nameOfModel) {
        this.nameOfModel = nameOfModel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return fuelFlow == car.fuelFlow &&
                coast == car.coast &&
                speed == car.speed &&
                Objects.equals(nameOfModel, car.nameOfModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fuelFlow, coast, nameOfModel, speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelFlow=" + fuelFlow +
                ", coast=" + coast +
                ", nameOfModel='" + nameOfModel + '\'' +
                ", speed=" + speed +
                '}';
    }
}
