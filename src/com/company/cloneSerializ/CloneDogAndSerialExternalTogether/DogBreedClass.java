package com.company.cloneSerializ.CloneDogAndSerialExternalTogether;

public class DogBreedClass implements  Cloneable{
    String name;

    public DogBreedClass(String name) {
        this.name = name;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}