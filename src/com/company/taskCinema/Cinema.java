package com.company.taskCinema;

import java.util.List;

public class Cinema {
        private String name;
        private Address address;
        private List<Film> films;


        public Cinema(String name, Address address, List<Film> films) {
            this.name = name;
            this.address = address;
            this.films = films;
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

        public List<Film> getFilms() {
            return films;
        }

        public void setFilms(List<Film> films) {
            this.films = films;
        }

        //Внутренний класс Фильм
        public static class Film {
            private String name;
            private List<String> time;


            public Film(String name, List<String> time) {
                this.name = name;
                this.time = time;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<String> getTime() {
                return time;
            }

            public void setTime(List<String> time) {
                this.time = time;
            }


            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(name).append(" ");
                sb.append("Время сеансов: ");
                for (String t : time) {
                    sb.append(t).append("; ");
                }
                sb.append("\n");
                return sb.toString();
            }
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
            for (Film f : films) {
                sb.append("Фильм: ").append(f);
            }
            sb.append("\n");
            return sb.toString();
        }
}
