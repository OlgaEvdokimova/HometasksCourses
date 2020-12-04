package com.company.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Seat {

    private Map<TypeSeat,Integer> seats= new HashMap<>();

    public Seat(Map<TypeSeat, Integer> seats) {
        this.seats = seats;
    }

    public Map<TypeSeat, Integer> getSeats() {
        return seats;
    }

    public void setSeats(Map<TypeSeat, Integer> seats) {
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return Objects.equals(seats, seat.seats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seats);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry <TypeSeat, Integer> seat : seats.entrySet()){
            sb.append(seat.getKey()).append(" ").append(seat.getValue()).append(", ");
        }
        return sb.toString();
    }
}
enum TypeSeat{
    SIMPLE,
    COUPE,
    LUX
}
