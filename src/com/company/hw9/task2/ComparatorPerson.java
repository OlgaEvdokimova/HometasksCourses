package com.company.hw9.task2;

import java.util.Comparator;

public class ComparatorPerson implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return (o2.getEndWork() - o2.getStartWork()) -
                (o1.getEndWork() - o1.getStartWork());
    }
}
