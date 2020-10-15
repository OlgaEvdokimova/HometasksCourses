package com.company.taskCinema;

import java.util.*;

public class Cinema {
    private String name;
    private Address address;
    private List<CinemaHall> halls;

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

    public Set<Session.Film> getMovies() {
        Set<Session.Film> filmSet = new HashSet<>();
        for (CinemaHall h : halls) {
            for (Session s : h.getSessions()) {
                filmSet.add(s.getFilm());
            }
        }
        return filmSet;
    }

    public List<Session.Film> getMovies(String date) {
        List<Session.Film> films = new ArrayList<>();
        for (CinemaHall hall : halls) {
            for (Session s : hall.getSessions()) {
                if (s.getDate().equals(date)) {
                    films.add(s.getFilm());
                }
            }
        }
        return films;
    }
        public List<Session> getSessions (String date){
            List<Session> sessions = new ArrayList<>();
           for (CinemaHall hall : halls){
               for (Session s : hall.getSessions()){
                   if (s.getDate().equals(date)){
                       sessions.add(s);
                   }
               }
           }
            return sessions;
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
        public String toString () {
            StringBuilder sb = new StringBuilder();
            sb.append("Кинотеатр ").append(name).append(address).append("\n");
            for (CinemaHall hall : halls) {
                sb.append(hall);
                sb.append("\n");
            }
            //sb.append("\n");
            return sb.toString();
        }
    }
