package com.company.cloneSerializ;

import java.io.*;
import java.util.regex.Pattern;

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
    public static final String PATH = "o.ser";

    public static void main(String[] args) {
        Horse horse = new Horse("white", 150, 10, "Altai", 165);
        System.out.println(horse + "\n");

        try {
            System.out.println("used Serializable");
            serialize(horse);
            deserialize(PATH, horse);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Cat cat = new Cat("ginger", 7, 3, "Mars", "Pers");
        System.out.println(cat + "\n");
        System.out.println("used Externalizable");
        try {
            serialize(cat);
            deserialize(PATH, cat);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Dog dog1 = new Dog("black", 15, 5, "Boston", "Bigl");
        Dog dog2 = new Dog("brown", 10, 2, "Kim", "Spaniel");
        System.out.println(dog1);
        cloneDog(dog1);
        System.out.println(dog2);
        cloneDog(dog2);


    }

    public static void serialize(Object o) throws IOException {
        FileOutputStream fos = new FileOutputStream(PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(o);
        oos.close();

    }

    public static void deserialize(String PATH, Object o) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Animal animal = (Animal) o;

        if (animal.isCat()) {
            Cat cat = (Cat) ois.readObject();
            System.out.println("Cat after deserialization: " + cat + "\n");
        }
        if (animal.isHorse()) {
            Horse horse = (Horse) ois.readObject();
            System.out.println("Horse after deserialization: " + horse + "\n");
        }
        ois.close();


    }

    public static void cloneDog(Dog dog) {
        try {
            dog = (Dog) dog.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Clone for Dog: " + dog);

    }
}
