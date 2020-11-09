package com.company.heavyBox;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        HeavyBox box1 = new HeavyBox(150);
        HeavyBox box2 = new HeavyBox(250);
        HeavyBox box3 = new HeavyBox(500);
        HeavyBox box4 = new HeavyBox(400);
        HeavyBox box5 = new HeavyBox(255);

        List<HeavyBox> heavyBoxList = new ArrayList<>() {
            {
                add(box1);
                add(box2);
                add(box3);
                add(box4);
                add(box5);
            }
        };
        List<HeavyBox> heavyBoxList2 = new ArrayList<>(heavyBoxList);
        // Распечатать его содержимое используя for each.
        heavyBoxList.forEach(System.out::println);

        System.out.println();
        // Изменить вес первого ящика на 1.
        heavyBoxList.get(0).changeWeight(1);
        //удалить поледний ящик
        heavyBoxList.remove(heavyBoxList.size() - 1);

        // Получить массив содержащий ящики из коллекции двумя способами и вывести на консоль.
        Object[] objects = heavyBoxList.toArray();
       //1
        for (Object o : objects) {
            System.out.println(o);
        }
        System.out.println();
        //2
        HeavyBox[] array = heavyBoxList.toArray(new HeavyBox[heavyBoxList.size()]);
        for (HeavyBox box : array) {
            System.out.println(box);
        }
        System.out.println();
        //3
        HeavyBox[] array2 = new HeavyBox[heavyBoxList.size()];


        for (int i = 0; i < heavyBoxList.size(); i++){
            array2[i] = new HeavyBox(heavyBoxList.get(i).getWeight());
            System.out.println(array2[i]);
        }
        System.out.println();

        // Удалить все ящики.
        heavyBoxList.clear();

        System.out.println();
        // Создать очередь, содержащую объекты класса HeavyBox. Используем класс ArrayDeque.
        Deque<HeavyBox> boxQueue = new ArrayDeque<>();

        boxQueue.offer(box1);
        boxQueue.offer(box2);
        boxQueue.offer(box3);
        boxQueue.offer(box4);
        boxQueue.offer(box5);
        while (!boxQueue.isEmpty()) {
            boxQueue.poll();
        }


        List<HeavyBox> heavyBoxList3 = new ArrayList<>(heavyBoxList2);

        // Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
        // Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.

        HeavyBox.checkBoxWeight(heavyBoxList3);


    }
}
