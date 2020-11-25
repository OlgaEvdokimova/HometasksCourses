package com.company.map13hw.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    /**
     * Cоздать класс Pet и его наследников Cat, Dog, Parrot. Создать класс Доктор,
     * содержащий имя и номер. Создать отображение из домашних животных, где в
     * качестве ключа выступает доктор, который обслуживает животное, а в
     * качестве значения – само животное.
     * 3) Многомерные отображения.
     * В дополнение к заданию 2 создадим класс Person. Создадим новое
     * отображение, которое будет хранить человека (как ключ) и список (List) всех
     * его животных (как значение).
     */
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Barsik");
        Dog dogLuntik = new Dog("Luntik");
        Parrot parrotKesha = new Parrot("Kesha");
        Doctor doctorCat = new Doctor("Kopylev", 1 );
        Doctor doctorDog = new Doctor("Irmakova", 2 );
        Doctor doctorParrot = new Doctor("Glush", 3 );

        Map<Pet, Doctor> petDoctorMap = new HashMap<>();
        petDoctorMap.put(catBarsik, doctorCat);
        petDoctorMap.put(dogLuntik, doctorDog);
        petDoctorMap.put(parrotKesha, doctorParrot);
        for (Map.Entry<Pet, Doctor> entry : petDoctorMap.entrySet()){
            System.out.println(entry.getKey() + " , " + entry.getValue());
        }

        Person person = new Person("Ivan", "Ivanov");
        List<Pet> pets = new ArrayList<Pet>(List.of(catBarsik,dogLuntik, parrotKesha));
        Map<Person,List<Pet>> mapPerson = new HashMap<>();
        mapPerson.put(person, pets);
        for (Map.Entry<Person, List<Pet>> entry : mapPerson.entrySet()){
            System.out.println(entry.getKey() + " , " + entry.getValue());
        }

    }
}
