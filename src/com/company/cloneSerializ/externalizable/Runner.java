package com.company.cloneSerializ.externalizable;

import java.io.*;

public class Runner {

    public static final String PATH = "cat.ser";

    public static void main(String[] args) {


        Cat cat = new Cat("ginger", 7, 3, "Mars", "Pers");
        System.out.println(cat + "\n");
        System.out.println("used Externalizable");
        try {
            serialize(cat);
            deserializeCat(PATH);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

    public static void serialize(Cat cat) throws IOException {
        FileOutputStream fos = new FileOutputStream(PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(cat);
        oos.close();

    }

    public static void deserializeCat(String PATH) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Cat cat = (Cat) ois.readObject();
        System.out.println("Cat after deserialization: " + cat + "\n");
        ois.close();


    }

}

