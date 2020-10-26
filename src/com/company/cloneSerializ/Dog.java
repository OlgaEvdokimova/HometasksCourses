package com.company.cloneSerializ;

import java.util.Objects;

public class Dog extends Animal {
    private String nickName;
    private String breed;

    public Dog(String color, int weight, int age, String nickName, String breed) {
        super(color, weight, age);
        this.nickName = nickName;
        this.breed = breed;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();


    }

    public boolean isTakePart() {
        return true;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(nickName, dog.nickName) &&
                Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nickName, breed);
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                "NickName='" + nickName + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
