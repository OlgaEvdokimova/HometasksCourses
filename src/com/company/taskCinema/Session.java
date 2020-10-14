package com.company.taskCinema;

import java.util.List;

public class Session {
    private String date;
    private String time;
    private Session.Film film;

    public Session(String date, String time, Session.Film film) {
        this.date = date;
        this.time = time;
        this.film = film;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    //Внутренний класс Фильм
    public static class Film {
        private String name;

        public Film(String name) {
            this.name = name;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(name).append(" ");

            return sb.toString();
        }
    }

    @Override
    public String toString() {
        return  film +  date + " " + time + "\n";
    }
}
