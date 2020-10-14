package com.company.taskCinema;

import java.util.List;

public class Cinema {
    private String name;
    private Address address;
    private List<CinemaHall> halls;
   // private Session.Film film;

    public Cinema(String name, Address address, List<CinemaHall> halls) {
        this.name = name;
        this.address = address;
        this.halls = halls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<CinemaHall> getHalls() {
        return halls;
    }

    public void setHalls(List<CinemaHall> halls) {
        this.halls = halls;
    }

    enum Address {
        SOVETSKAYA("Гомель, ул.Советская"), BELITSA("Гомель, Белица"), OKTYABR("Гомель, пр-т Октября");

        String address;

        Address(String address) {
            this.address = address;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return ". " + address;
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Кинотеатр ").append(name).append(address).append("\n");
        for (CinemaHall hall : halls) {
            sb.append(hall);
            sb.append("\n");
        }
        sb.append("\n");
        return sb.toString();
    }
}
