package com.company.map13hw.task3;

import com.company.map13hw.task2.Cat;
import com.company.map13hw.task2.Dog;
import com.company.map13hw.task2.Parrot;
import com.company.map13hw.task2.Pet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    /**Напишите метод, который на вход получает коллекцию объектов (например,
     ArrayList), а возвращает коллекцию уже без дубликатов.
     */
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Barsik");
        Dog dogLuntik = new Dog("Luntik");
        Parrot parrotKesha = new Parrot("Kesha");

        Cat catBarsik2 = new Cat("Barsik");
        Dog dogLuntik2 = new Dog("Luntik");
        Parrot parrotKesha2 = new Parrot("Kesha");

        Set<Pet> setOfPets = new HashSet<Pet>(List.of(catBarsik,catBarsik2, dogLuntik, dogLuntik2, parrotKesha, parrotKesha2));
        System.out.println(setOfPets);
    }
}
