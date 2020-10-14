package com.company.taskCinema;

import java.util.List;
import java.util.Set;

public class StringUtils {
    public static String convertToString(Set<Session.Film> films){
        StringBuilder sb = new StringBuilder();
        for (Session.Film film: films){
            sb.append(film).append("\n");
        }
        return sb.toString();
    }
    public static String convertToString(List<Session.Film> films){
        StringBuilder sb = new StringBuilder();
        for (Session.Film film: films){
            sb.append(film).append("\n");
        }
        return sb.toString();
    }
    public  static String convertToString(Session session){
        StringBuilder sb = new StringBuilder();
        sb.append(session);
        return sb.toString();
    }
}
