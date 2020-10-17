package com.company.hw9.task2;

import java.util.Objects;

public class Person {
    private String name;
    private String lastName;
    private int startWork;
    private int endWork;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStartWork() {
        return startWork;
    }

    public void setStartWork(int startWork) {
        this.startWork = startWork;
    }

    public int getEndWork() {
        return endWork;
    }

    public void setEndWork(int endWork) {
        this.endWork = endWork;
    }

    public String getNamePerson(){
        return name + " " + lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", startWork=" + startWork +
                ", endWork=" + endWork +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return startWork == person.startWork &&
                endWork == person.endWork &&
                Objects.equals(name, person.name) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, startWork, endWork);
    }
}
