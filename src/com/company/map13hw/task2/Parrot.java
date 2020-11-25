package com.company.map13hw.task2;

import java.util.Objects;

public class Parrot  extends  Pet{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Parrot " +
                super.toString();
    }
}
