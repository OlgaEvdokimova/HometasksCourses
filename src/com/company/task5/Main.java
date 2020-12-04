package com.company.task5;

import java.util.*;

public class Main {
    /**
     * Дана упорядоченная последовательность чисел от 1 до N.
     * Из нее удалили одно число, а оставшиеся перемешали.
     * Найти удаленное число за 1 проход по массиву (т.е. ыцикл
     * for используется только 1 раз).
     */
    public static void main(String[] args) {
        int n = 100;
        Integer[] array = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = i +1;
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        //удалили число и перемешали
        Integer removedNumber = list.remove(random.nextInt(100));
        System.out.println(removedNumber);
        Collections.shuffle(list);
        System.out.println(list);

        //выставляем по-порядку , далее в Лист, и там ищем
        Set<Integer> treeSet = new TreeSet<>(list);
        System.out.println(treeSet);
        List<Integer> list2 = new ArrayList<>(treeSet);
        Integer searchedNumber = null;
        for (int i = 0; i < list2.size() - 1; i++) {
                if (list2.get(i + 1) - list2.get(i) != 1) {
                    searchedNumber = (list2.get(i) + list2.get(i + 1)) / 2;
                    break;
                }
        }
        System.out.println(searchedNumber);
    }
}

