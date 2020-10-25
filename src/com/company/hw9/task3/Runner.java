package com.company.hw9.task3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Runner {
    public static String PATH = "D:\\Java\\StudyWithValeria\\StudyStudy\\src\\com\\company\\hw9\\task3\\Person.java";
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream(PATH)){
            byte[] byteArr = new byte[fis.available()];
            fis.read(byteArr, 0 , byteArr.length);
            String text = new String(byteArr);
            text.replaceAll("public", "private");
            System.out.println(text);
            FileOutputStream fos = new FileOutputStream(PATH);
            fos.write(text.getBytes());
            fos.close();
        }catch (IOException e){
            e.getMessage();
        }

    }
}
