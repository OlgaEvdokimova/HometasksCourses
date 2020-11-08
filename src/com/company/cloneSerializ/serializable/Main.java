package com.company.cloneSerializ.serializable;

import java.io.*;

public class Main {
    /**
     * Иерархия объектов: класс Animal – поля: цвет, вес, возраст; наследники:
     * Horse (порода, рост), Dog(кличка, порода, участвует ли в выставках).
     * 1) Создайте метод, который сериализует класс Horse(наследник
     * класса Animal)в файл и метод, который десериализует его.
     * 2) Создайте метод, корректно который клонирует объекты класса Dog.
     * 3) Создайте еще одного наследника - класс Cat с полями кличка и
     * порода, пользуясь интерфейсом Externalizable реализуйте
     * собственный механизм сериализации и десериализации.
     */
    public static final String PATH = "horse.ser";

    // почему-то  в файл записывается null какие-то, но десериализуются нормально вроде.
    // Cat c Externalizable в отдельной папке

    public static void main(String[] args) {
        Horse horse = new Horse("white", 150, 10, "Altai", 165);
        System.out.println(horse + "\n");

        try {
            System.out.println("used Serializable");
            serialize(horse);
            deserialize(PATH);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void serialize(Object o) throws IOException {
        FileOutputStream fos = new FileOutputStream(PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(o);
        oos.close();

    }

    public static void deserialize(String PATH) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o =  ois.readObject();
        System.out.println("Horse after deserialization: " + o + "\n");
        ois.close();
    }

}
