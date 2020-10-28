package com.company.cloneSerializ.CloneDogAndSerialExternalTogether;

import java.io.*;

public class Horse extends Animal implements Serializable {
    public static final String PATH_HORSE = "horse.ser";
    public static final long serialVersionUID = 2L;
    private String breed;
    private int height;

    public Horse() {
    }

    public Horse(String color, int weight, int age, String breed, int height) {
        super(color, weight, age);
        this.breed = breed;
        this.height = height;
    }

    public void serialize() throws IOException {
        FileOutputStream fos = new FileOutputStream(PATH_HORSE);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this);
        oos.close();
    }

    public static void deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(PATH_HORSE);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Horse horse = (Horse) ois.readObject();
        System.out.println("Horse after deserialization: " + horse + "\n");
        ois.close();
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public boolean isHorse() {
        return true;
    }

    @Override
    public boolean isCat() {
        return false;
    }

    @Override
    public String toString() {
        return "Horse{" + super.toString() +
                "breed='" + breed + '\'' +
                ", height=" + height +
                '}';
    }
}
