package com.company.task1;

import java.util.Objects;

public class Parrot extends Pet implements Comparable<Parrot> {
    public Parrot(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Parrot o) {
        return this.getName().compareTo(o.getName());
    }
}