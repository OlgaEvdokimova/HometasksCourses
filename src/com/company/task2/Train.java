package com.company.task2;

import java.util.Objects;

public class Train {
    private Integer number;
    private String from;
    private String to;
    private String timeDeparture;
    private Seat seat;


    public Train(Integer number, String from, String to, String timeDeparture, Seat seat) {
        this.number = number;
        this.from = from;
        this.to = to;
        this.timeDeparture = timeDeparture;
        this.seat = seat;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(String timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return Objects.equals(number, train.number) &&
                Objects.equals(from, train.from) &&
                Objects.equals(to, train.to) &&
                Objects.equals(timeDeparture, train.timeDeparture) &&
                Objects.equals(seat, train.seat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, from, to, timeDeparture, seat);
    }

    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", timeDeparture='" + timeDeparture + '\'' +
                ", seat=" + seat +
                '}';
    }
}
