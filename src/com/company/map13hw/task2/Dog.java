package com.company.map13hw.task2;

import java.util.Objects;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog " +
                super.toString();
    }
}
