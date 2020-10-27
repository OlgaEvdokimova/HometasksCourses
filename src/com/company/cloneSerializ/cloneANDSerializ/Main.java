package com.company.cloneSerializ.cloneANDSerializ;

import com.company.cloneSerializ.externaliz.Cat;

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
    // кот c Externalizable в отдельной папке, для удобства проверки, потому что иначе Serializable
    // берет пустой конструктор и получается null
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

        Dog dog1 = new Dog("black", 15, 5, "Boston", "Bigl");
        Dog dog2 = new Dog("brown", 10, 2, "Kim", "Spaniel");
        System.out.println(dog1);
        cloneDog(dog1);
        System.out.println(dog2);
        cloneDog(dog2);


    }

    public static void serialize(Horse o) throws IOException {
        FileOutputStream fos = new FileOutputStream(PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(o);
        oos.close();

    }

    public static void deserialize(String PATH) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Horse horse = (Horse) ois.readObject();
        System.out.println("Horse after deserialization: " + horse + "\n");

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
