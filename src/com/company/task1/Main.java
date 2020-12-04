package com.company.task1;

import java.util.Comparator;
import java.util.TreeMap;

public class Main {
    /**
     * Использовать иерархию из задания 13.2 (животные).
     * Использовать в качестве ключа для TreeMap объекты
     * класса Parrot. В качестве значения использовать объекты
     * класса Doctor. Вывести все элементы на экран. Написать
     * свой компаратор для класса Parrot и создать второй
     * TreeMap. Вывести и его элементы.
     */
    public static void main(String[] args) {

        Parrot parrotKesha = new Parrot("Kesha");
        Parrot parrotDodik = new Parrot("Dodik");
        Parrot parrotBoss = new Parrot("Boss");
        Doctor doctorParrot = new Doctor("Glush", 1 );
        TreeMap<Parrot, Doctor> parrotDoctorTreeMap = new TreeMap<>();
        parrotDoctorTreeMap.put(parrotKesha, doctorParrot);
        parrotDoctorTreeMap.put(parrotDodik, doctorParrot);
        parrotDoctorTreeMap.put(parrotBoss, doctorParrot);
        //имена по возрастанию
        System.out.println(parrotDoctorTreeMap);



//        Comparator<Parrot> comparator = new Comparator<Parrot>() {
//            @Override
//            public int compare(Parrot o1, Parrot o2) {
//                return o2.getName().compareTo(o1.getName());
//            }
//        };
        // имена по убыванию
        Comparator <Parrot> comparator = (o1, o2) -> o2.getName().compareTo(o1.getName());

        TreeMap<Parrot, Doctor> parrotDoctorTreeMap2 = new TreeMap<>(comparator);
        parrotDoctorTreeMap2.put(parrotKesha, doctorParrot);
        parrotDoctorTreeMap2.put(parrotDodik, doctorParrot);
        parrotDoctorTreeMap2.put(parrotBoss, doctorParrot);

        System.out.println(parrotDoctorTreeMap2);
    }

}
