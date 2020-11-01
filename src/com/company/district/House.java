package com.company.district;

import java.util.List;
import java.util.Objects;

public class House {
    private int number;
    private int NStoryBuilding;
    private List<Room> rooms;

    public House() {
    }

    public House(int number, int NStoryBuilding, List<Room> rooms) {
        this.number = number;
        this.NStoryBuilding = NStoryBuilding;
        this.rooms = rooms;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNStoryBuilding() {
        return NStoryBuilding;
    }

    public void setNStoryBuilding(int NStoryBuilding) {
        this.NStoryBuilding = NStoryBuilding;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return number == house.number &&
                NStoryBuilding == house.NStoryBuilding &&
                Objects.equals(rooms, house.rooms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, NStoryBuilding, rooms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("House ");
        sb.append("N = ").append(number).append(", ").append(NStoryBuilding).append(" story-building, ");
        for (int i = 0; i < rooms.size(); i++) {
            sb.append("room ").append(i + 1).append(" - ").append(rooms.get(i));
        }
        return sb.toString();
    }
}
