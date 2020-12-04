package com.company.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    /**
     * Пункт назначения, Номер поезда, Время отправления,
     * Число мест (общих, купе, плацкарт, люкс).
     * Создать список объектов. Вывести:
     * a) список поездов, следующих до заданного пункта
     * назначения;
     * b) список поездов, следующих до заданного пункта
     * назначения и отправляющихся после заданного часа;
     * c) список поездов, отправляющихся до заданного пункта
     * назначения.
     */
    public static void main(String[] args) {
        Map<TypeSeat, Integer> mapSeats1 = new HashMap<>();
        mapSeats1.put(TypeSeat.COUPE, 50);
        mapSeats1.put(TypeSeat.SIMPLE, 150);
        mapSeats1.put(TypeSeat.LUX, 10);
        Seat seats1 = new Seat(mapSeats1);
        Train train1 = new Train(1, "Gomel", "Minsk", "21.00", seats1);

        Map<TypeSeat, Integer> mapSeats2 = new HashMap<>();
        mapSeats2.put(TypeSeat.COUPE, 30);
        mapSeats2.put(TypeSeat.SIMPLE, 350);
        mapSeats2.put(TypeSeat.LUX, 10);
        Seat seats2 = new Seat(mapSeats2);
        Train train2 = new Train(2, "Minsk", "Gomel", "11.00", seats2);

        Map<TypeSeat, Integer> mapSeats3 = new HashMap<>();
        mapSeats3.put(TypeSeat.COUPE, 50);
        mapSeats3.put(TypeSeat.SIMPLE, 250);
        mapSeats3.put(TypeSeat.LUX, 10);
        Seat seats3 = new Seat(mapSeats3);
        Train train3 = new Train(3, "Minsk", "Gomel", "15.00", seats3);

        List<Train> trainList = new ArrayList<>(List.of(train1, train2, train3));
        System.out.println(TrainListUtil.trainsToDestination(trainList, "Gomel"));
        System.out.println(TrainListUtil.trainsToDestinationAfterTime(trainList, "Gomel", "14.00"));
        System.out.println(TrainListUtil.trainsFromTo(trainList, "Gomel", "Minsk"));
    }

}
