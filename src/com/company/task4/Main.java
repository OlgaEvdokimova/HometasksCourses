package com.company.task4;

import java.util.*;

public class Main {
    /**
     * Напишите метод, находящий максимальное из двух чисел,
     * не используя операторы if-else или любые другие
     * операторы сравнения.
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2));

        System.out.println(max(list));
    }
    public static int max(List<Integer> list){
        //тут можно неск. вариантов

        //return Collections.max(list);

        return  new TreeSet<>(list).last();

    }
}
