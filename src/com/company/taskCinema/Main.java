package com.company.taskCinema;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Создать класс Cinema с внутренним классом,
     * с помощью объектов которого можно хранить информацию об адресах кинотеатров, фильмах и времени начала сеансов.
     */
    public static void main(String[] args) {

        List<String> time1 = new ArrayList<>() {
            {
                add("13:50");
                add("17:50");
            }
        };
        List<String> time2 = new ArrayList<>() {
            {
                add("11:50");
                add("20:00");
            }
        };

        Cinema.Film film1 = new Cinema.Film("Форсаж", time1);
        Cinema.Film film2 = new Cinema.Film("ЛюдиХ", time2);
        Cinema.Film film3 = new Cinema.Film("Незваные", time1);
        Cinema.Film film4 = new Cinema.Film("Лунтик", time2);
        List<Cinema.Film> filmsSov = new ArrayList<>() {
            {
                add(film1);
                add(film2);

            }
        };
        Cinema cinemaSov = new Cinema("\"им. Калинина\"", Cinema.Address.SOVETSKAYA, filmsSov);

        List<Cinema.Film> filmsBel = new ArrayList<>() {
            {
                add(film1);
                add(film3);
            }
        };
        Cinema cinemaBelitsa = new Cinema("\"Мир\"", Cinema.Address.BELITSA, filmsBel);

        List<Cinema.Film> filmsOkt = new ArrayList<>() {
            {
                add(film2);
                add(film4);
            }
        };
        Cinema cinemaOkt = new Cinema("\"Октябрь\"", Cinema.Address.OKTYABR, filmsOkt);

        List<Cinema> cinemas = new ArrayList<>() {{
            add(cinemaSov);
            add(cinemaBelitsa);
            add(cinemaOkt);
        }};
        Poster poster = new Poster(cinemas);
        System.out.println(poster);
        System.out.println(poster.getFilmByName("\"Октябрь\""));
        System.out.println(poster.getCinemaByFilm("Форсаж"));
    }
}
