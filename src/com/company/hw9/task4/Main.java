package com.company.hw9.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    /**
     * В файле содержится совокупность строк с email-адресами и другими
     * данными. Найти номера строк, которые начинаются с большой буквы
     * и содержат точку. Найти строки, которые содержат email и вывести
     * все emails на экран.
     */
    public static final String PATH = "D:\\Java\\StudyWithValeria\\StudyStudy\\src\\com\\company\\hw9\\task4\\file.txt";

    public static void main(String[] args) {

        String text = Reader.getInfo(PATH);
//могу вывести или до первой точки, или до первого емэйла включительно, но все строчку с емэйлами не получилось
        Pattern pattern1 = Pattern.compile("[А-Я][^!.?]+\\.[\\w{2,4}]*.*");
        //до первой точки
        //Pattern pattern1 = Pattern.compile("[А-Я][^!.?]+\\.");

        Pattern pattern2 = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");

        for (String s : matcher(pattern1, text)) {
            System.out.println(s);
        }

        System.out.println();

        for (String s : matcher(pattern2, text)) {
            System.out.println(s);
        }
    }

    public static List<String> matcher(Pattern pattern, String text) {
        List<String> list = new ArrayList<>();
        Matcher m = pattern.matcher(text);
        while (m.find()) {
            String matcher = m.group();
            list.add(matcher);
        }
        return list;
    }
}
