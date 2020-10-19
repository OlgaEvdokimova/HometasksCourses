package com.company.hw9.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    /**
     * Прочитать текст Java-программы и все слова public в объявлении ат-
     * рибутов и методов класса заменить на слово private.
     */
    public static String PATH = "D:\\Java\\StudyWithValeria\\StudyStudy\\src\\com\\company\\hw9\\task3\\Person.java";

    //Перезаписываю файл, путь которого выше. Если надо вернуть код обратно, то в файле person.txt лежит код первонач.
    //все лежит в этой папке
    public static void main(String[] args) {
        try(BufferedReader bf = new BufferedReader(new FileReader(PATH))) {
            String line;

            List<String> list = new ArrayList<>();
            String lineReplaced = "";
            while ((line = bf.readLine()) != null){

                Pattern pattern = Pattern.compile("public");
                Matcher matcher = pattern.matcher(line);
                lineReplaced = matcher.replaceAll("private");
                list.add(lineReplaced);

            }
            FileWriter fileWriter = new FileWriter("D:\\Java\\StudyWithValeria\\StudyStudy\\src\\com\\company\\hw9\\task3\\Person.java");
            for (String s : list){
                fileWriter.write(s);
                fileWriter.write("\n");
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
