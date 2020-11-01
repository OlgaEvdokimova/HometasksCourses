package com.company.district;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //Создайте класс Дом, который имеет номер, количество этажей, состоит из Комнат. Комната
//содержит в себе список всех ее Жителей. Житель имеет имя, фамилию, возраст.
//В main создайте «район», состоящий из произвольного количества домов.

    public static void main(String[] args) {
        // Первый дом
        Dweller dweller11 = new Dweller("Olga", "Kim", 23);
        Dweller dweller12 = new Dweller("Ivan", "Kim", 25);
        Dweller dweller13 = new Dweller("Liza", "Kim", 45);
        List<Dweller> dwellers11 = new ArrayList<>(Arrays.asList(dweller11, dweller12));
        List<Dweller> dwellers12 = new ArrayList<>(Arrays.asList(dweller13));
        Room room11 = new Room(dwellers11);
        Room room12 = new Room(dwellers12);
        List<Room> rooms1 = new ArrayList<>(Arrays.asList(room11, room12));
        House house1 = new House(0, 2, rooms1);

        //Второй дом
        Dweller dweller21 = new Dweller("Nikita", "Glush", 27);
        Dweller dweller22 = new Dweller("Ira", "Glush", 25);
        Dweller dweller23 = new Dweller("Liza", "Glush", 45);
        Dweller dweller24 = new Dweller("Sergey", "Glush", 49);
        Dweller dweller25 = new Dweller("Kolya", "Dik", 67);
        Dweller dweller26 = new Dweller("Marina", "Dik", 69);
        List<Dweller> dwellers21 = new ArrayList<>(Arrays.asList(dweller21, dweller22));
        List<Dweller> dwellers22 = new ArrayList<>(Arrays.asList(dweller23, dweller24));
        List<Dweller> dwellers23 = new ArrayList<>(Arrays.asList(dweller25, dweller26));
        Room room21 = new Room(dwellers21);
        Room room22 = new Room(dwellers22);
        Room room23 = new Room(dwellers23);
        List<Room> rooms2 = new ArrayList<>(Arrays.asList(room21, room22, room23));
        House house2 = new House(0, 1, rooms2);

        //Третий дом
        Dweller dweller31 = new Dweller("Anna", "Zaluzh", 34);
        Dweller dweller32 = new Dweller("Katya", "Zaluzh", 30);
        List<Dweller> dwellers31 = new ArrayList<>(Arrays.asList(dweller31));
        List<Dweller> dwellers32 = new ArrayList<>(Arrays.asList(dweller32));
        Room room31 = new Room(dwellers31);
        Room room32 = new Room(dwellers32);
        List<Room> rooms3 = new ArrayList<>(Arrays.asList(room31, room32));
        House house3 = new House(0, 2, rooms3);

        //Район
        List<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);

        //В цикле for присвойте каждому дому в районе номер, соответствующий порядковому номеру
        //дома в «районе».
        for (int i = 0; i < houses.size(); i++) {
            houses.get(i).setNumber(i + 1);
        }

        for (House house : houses) {
            System.out.println(house);
        }

        System.out.println();
        //Используя метод contains найдите, содержит ли «район» дом с номером 3, 5 этажами и 2
        //конкретными комнатами и жителями в них и если да, то выведите соответс сообщение в консоль.

        System.out.println("Cодержит ли «район» дом с номером 3, 2 этажами и 2 конкретными комнатами и жителями в них?");
        for (House house : houses) {
            if (house.getNumber() == 3 && house.getNStoryBuilding() == 2) {
                if (house.getRooms().size() == 2) {
                    for (Room room : house.getRooms()) {
                        if (room.getDwellers().containsAll(dwellers32)) {
                        }
                        System.out.println("Содержит: " + house);
                    }
                }
            }
        }
        System.out.println();
        //Добавьте в одну из комнат одного из домов двух новых жителей.
        List<Dweller> dwellersRoom32 = houses.get(2).getRooms().get(1).getDwellers();
        dwellersRoom32.add(new Dweller("Alex", "Milin", 43));
        System.out.println(house3);
    }
}
