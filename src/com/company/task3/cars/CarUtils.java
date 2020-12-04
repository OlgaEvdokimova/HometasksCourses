package com.company.task3.cars;

import java.util.List;

public class CarUtils {
    public static int entireCoastOfCArs(List<Car> cars) {
        int entireCoastCars = 0;
        for (Car car : cars) {
            entireCoastCars += car.getCoast();
        }
        return entireCoastCars;
    }

//возможно тут что-то не верно, мне не очень нравится реализация , по=другому что-то не приходит в голову
    public static Car findSpecialSpeedCar(List<Car> cars, int speed1, int speed2) {
        Car specialSpeedCar = null;
        for (Car car : cars) {
            if (car.getSpeed() >= speed1 && car.getSpeed() <= speed2) {
                return car;
            } else {
                System.out.println("there is no car with such speed");
                break;
            }
        }
        //особенно вот этот момент мне не нравится
        return specialSpeedCar;
    }
}
