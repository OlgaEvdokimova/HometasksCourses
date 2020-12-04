package com.company.task3.cars;

import com.company.collections14.task3.cars.econom.Reno;
import com.company.collections14.task3.cars.econom.VW;
import com.company.collections14.task3.cars.lux.BMV;
import com.company.collections14.task3.cars.lux.Mers;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    /**
     * Таксопарк. Определить иерархию легковых автомобилей.
     * Создать таксопарк. Подсчитать стоимость автопарка.
     * Провести сортировку автомобилей парка по расходу
     * топлива. Найти автомобиль в компании, соответствующий
     * заданному диапазону параметров скорости.
     */
    public static void main(String[] args) {
        Mers mers = new Mers(12, 30000, "C", 250 );
        BMV bmv = new BMV(13,25000, "X1", 300);
        VW polo = new VW(8, 18000, "Polo", 200);
        Reno logan = new Reno(7, 15000, "Logan", 180);
        List<Car> cars = new ArrayList<>(List.of(mers, bmv, logan,polo)) ;

        System.out.println("the auto coast " + CarUtils.entireCoastOfCArs(cars));
        CarUtils.findSpecialSpeedCar(cars, 180, 260);
        System.out.println("car with the speed: " + CarUtils.findSpecialSpeedCar(cars,250, 280));

        System.out.println("ascending fuel flow (less - much)");
        Comparator<Car> comparatorLessFlow = (o1, o2) -> o1.getFuelFlow() - o2.getFuelFlow();
        Collections.sort(cars, comparatorLessFlow);
        System.out.println(cars);

        System.out.println("descending fuel flow ( much - less )");
        Comparator<Car> comparatorMuchFuelFlow = (o1, o2) -> o2.getFuelFlow() - o1.getFuelFlow();
        Collections.sort(cars, comparatorMuchFuelFlow);
        System.out.println(cars);

    }

}
