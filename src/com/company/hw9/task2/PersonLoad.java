package com.company.hw9.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class PersonLoad {
    private static final int FIRST_NAME = 0;
    private static final int LAST_MAME = 1;
    private static final int START_WORK = 2;
    private static final int END_WORK = 3;

    public List<Person> getPersons() throws NotAgeException {
        List<Person> persons = new ArrayList<>();
        int startWork;
        int endWork;
        try {
            String line;
            BufferedReader fileReader = new BufferedReader(new FileReader("D:\\Java\\StudyWithValeria\\StudyStudy\\src\\com\\company\\hw9\\task2\\work"));
            while ((line = fileReader.readLine()) != null) {
                String[] splitLine = line.split("\\s+");
                try {
                    startWork = Integer.parseInt(splitLine[START_WORK]);
                } catch (NumberFormatException e) {
                    throw new NotAgeException(splitLine[START_WORK] + " not a number");
                }
                try {
                    endWork = Integer.parseInt(splitLine[END_WORK]);
                } catch (NumberFormatException e) {
                    throw new NotAgeException(splitLine[END_WORK] + " not a number");
                }
                Person person = new Person();
                person.setName(splitLine[FIRST_NAME]);
                person.setLastName(splitLine[LAST_MAME]);
                person.setStartWork(startWork);
                person.setEndWork(endWork);
                persons.add(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;
    }

    public Person personTheBiggestExperience(){
        Person personMaxExperience = null;

        try {
            List<Person> persons = getPersons();
            Collections.sort(persons, new ComparatorPerson());
            if (!persons.isEmpty()) {
                personMaxExperience = persons.get(0);
            } else {
                System.out.println("Empty list");
            }
        }catch (NotAgeException e){
            System.out.println(e.getMessage());
        }


// Тут более скучное решение, с которого я начинала )
//        Person personMaxExperience = null;
//        try {
//            int maxExperience = getPersons().get(0).getEndWork() - getPersons().get(0).getStartWork();
//
//            for (Person p : getPersons()){
//               if ((p.getEndWork() - p.getStartWork() )>= maxExperience) {
//                   personMaxExperience = p;
//               }
//            }
//        } catch (NotAgeException e) {
//            e.printStackTrace();
//        }
        return personMaxExperience;


    }
}
