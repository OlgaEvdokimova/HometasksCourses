package com.company;

import java.util.Objects;

@Version(version = 7.1)
public class MyService {
    private String name;
    private double number;

    public MyService() {
    }

    private void thisClassInfo() {
        System.out.println(name + " " + number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return Double.compare(myService.number, number) == 0 &&
                Objects.equals(name, myService.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
