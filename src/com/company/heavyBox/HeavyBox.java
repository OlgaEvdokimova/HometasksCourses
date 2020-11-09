package com.company.heavyBox;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class HeavyBox {
    private int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void changeWeight(int n){
         setWeight(weight + 1);
    }
    public static void checkBoxWeight(List<HeavyBox> heavyBoxList){
        List<HeavyBox> newCollection = heavyBoxList.stream()
                .filter(b -> b.getWeight() > 300)
                .collect(Collectors.toList());
        newCollection.forEach(System.out::println);
    }
    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavyBox heavyBox = (HeavyBox) o;
        return weight == heavyBox.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }
}
