package com.company.district;

import java.util.List;
import java.util.Objects;

public class Room {
    private List<Dweller> dwellers;

    public Room(List<Dweller> dwellers) {
        this.dwellers = dwellers;
    }

    public List<Dweller> getDwellers() {
        return dwellers;
    }

    public void setDwellers(List<Dweller> dwellers) {
        this.dwellers = dwellers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(dwellers, room.dwellers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dwellers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dwellers: ");
        for (Dweller dweller : dwellers) {
            sb.append(dweller).append(", ");
        }
        return sb.toString();
    }
}
