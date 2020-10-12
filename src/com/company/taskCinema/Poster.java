package com.company.taskCinema;

import java.util.ArrayList;
import java.util.List;

public class Poster {
    private List<Cinema> cinemas;

    public Poster(List<Cinema> cinemas) {
        this.cinemas = cinemas;
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<Cinema> cinemas) {
        this.cinemas = cinemas;
    }

    public String getFilmByName(String name) {
        List<Cinema.Film> filmList = new ArrayList<>();
        for (Cinema c : cinemas){
            if (c.getName().equals(name)){
                filmList =  c.getFilms();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Cinema.Film f : filmList){
            sb.append(f);
        }
        return sb.toString();
    }

    public String getCinemaByFilm(String nameOfFilm) {
        StringBuilder sb = new StringBuilder();
        for (Cinema c : cinemas){
            for (Cinema.Film f : c.getFilms()) {
                if (f.getName().equals(nameOfFilm)) {
                    sb.append(c.getName()).append("\n");
                }
            }
        }
        return sb.toString();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Cinema c : cinemas) {
            sb.append(c);
        }
        return sb.toString();
    }

}
