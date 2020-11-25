package com.company.map13hw.task1;

import java.util.*;

public class Main {
    /**
     * Сгенерируйте массив, состоящий из 25 случайных элементов. Используя
     * HashMap посчитайте количество вхождений каждого числа, встречающегося в
     * массиве хотя бы однажды, в этот массив. Пример: массив[] = {2,3,4,5,4,7, 5,3},
     * вывод: 2 - 1, 3 - 2, 7 - 1, 4 - 2, 5 - 2.
     * public static void main(String[] args) {
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[25];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer el : array){
            if (!map.containsKey(el)){
                map.put(el, 0);
            }
            map.put(el, map.get(el) + 1);
        }
        for (Map.Entry<Integer, Integer> el : map.entrySet()){
            System.out.println(el.getKey() + " - " + el.getValue());
        }

    }

}
