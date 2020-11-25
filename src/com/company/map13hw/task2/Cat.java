package com.company.map13hw.task2;

import java.util.Objects;

public class Cat extends  Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat " + super.toString();
    }
}
