package com.company.taskCinema;

import java.util.ArrayList;
import java.util.List;

public class Poster {
    private List<Cinema> cinemas;
    private List<Session.Film> films;

    public Poster(List<Cinema> cinemas) {
        this.cinemas = cinemas;
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<Cinema> cinemas) {
        this.cinemas = cinemas;
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
