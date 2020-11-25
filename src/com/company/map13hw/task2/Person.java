package com.company.map13hw.task2;

import java.util.Objects;

public class Person {
    private String name;
    private String LastName;

    public Person(String name, String lastName) {
        this.name = name;
        LastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(LastName, person.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, LastName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
