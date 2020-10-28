package com.company.cloneSerializ.serializable;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {
    public static final long serialVersionUID = 2L;
    private String breed;
    private int height;


    public Horse(String color, int weight, int age, String breed, int height) {
        super(color, weight, age);
        this.breed = breed;
        this.height = height;
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
    public String getColor() {
        return super.getColor();
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public int getAge() {
        return super.getAge();
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
