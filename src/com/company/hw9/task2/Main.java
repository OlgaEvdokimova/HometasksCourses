package com.company.hw9.task2;

public class Main {
    /**
     * В текстовом файле хранится информация о сотрудниках компании
     * (имя, фамилия, год начала контракта, год окончания контракта).
     * Написать программу, которая считывает информацию из файла и
     * выводит в консоль имя и фамилию сотрудника с наибольшим стажем.
     */
    public static void main(String[] args) {
        PersonLoad personLoad = new PersonLoad();
        System.out.println(personLoad.personTheBiggestExperience().getNamePerson() + " has the biggest experience" );
    }
}
