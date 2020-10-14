package com.company.taskCinema;

import java.util.List;

public class CinemaHall {
    private String name;
    private List<Session> sessions;

    public CinemaHall(String name, List<Session> sessions) {
        this.name = name;
        this.sessions = sessions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("\n");
        for (Session s : sessions) {
            sb.append(s);

        }
        return sb.toString();
    }
}
