package com.company.cloneSerializ.CloneDogAndSerialExternalTogether;

import java.io.*;

public class Cat extends Animal implements Externalizable {
    public static final String PATH_CAT = "cat.ser";
    private String nickName;
    private String breed;

    public Cat() {
    }

    public Cat(String color, int weight, int age, String nickName, String breed) {
        super(color, weight, age);
        this.nickName = nickName;
        this.breed = breed;
    }

    public void serialize() throws IOException {
        FileOutputStream fos = new FileOutputStream(PATH_CAT);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this);
        oos.close();
    }

    public static void deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(PATH_CAT);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Cat cat = (Cat) ois.readObject();
        System.out.println("Cat after deserialization: " + cat + "\n");
        ois.close();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        super.writeExternal(out);
        out.writeObject(this.nickName);
        out.writeObject(this.breed);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        super.readExternal(in);
        nickName = (String) in.readObject();
        breed = (String) in.readObject();

    }

    @Override
    public boolean isCat() {
        return true;
    }

    @Override
    public boolean isHorse() {
        return false;
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() +
                "nickName='" + nickName + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}

