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

        heavyBoxList.forEach(System.out::println);

        System.out.println();

        heavyBoxList.get(0).setWeight(1);

        heavyBoxList.remove(heavyBoxList.size() - 1);


        Object[] objects = heavyBoxList.toArray();
        for (Object o : objects) {
            System.out.println(o);
        }
        System.out.println();
        HeavyBox[] array = heavyBoxList.toArray(new HeavyBox[heavyBoxList.size()]);
        for (HeavyBox box : array) {
            System.out.println(box);
        }
        System.out.println();

        Deque<HeavyBox> boxQueue = new ArrayDeque<>();

        boxQueue.offer(box1);
        boxQueue.offer(box2);
        boxQueue.offer(box3);
        boxQueue.offer(box4);
        boxQueue.offer(box5);
        while (!boxQueue.isEmpty()) {
            boxQueue.poll();
        }
        if (boxQueue.isEmpty()) {
            System.out.println("empty");
        }


        //Если вес коробки больше 300 гр, коробка
        //перемещается в другую коллекцию.
        // изучаю стримы сейчас, решила пробовать писать ими, что могу
        List<HeavyBox> newCollection = heavyBoxList.stream()
                .filter(b -> b.getWeight() > 300)
                .collect(Collectors.toList());
        newCollection.forEach(System.out::println);

    }
}
