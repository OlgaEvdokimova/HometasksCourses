package com.company.hw9.task1;

import java.lang.invoke.WrongMethodTypeException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    /**
     Создать статический метод который принимает на вход три
     параметра: login, password и confirmPassword. Login должен
     содержать только латинские буквы, цифры и знак подчеркивания. [См.
     Регулярные выражения в Java] Длина login должна быть больше 3 и
     меньше 20 символов. Если login не соответствует этим требованиям,
     необходимо выбросить WrongLoginException. Password должен
     содержать только латинские буквы, цифры  знак подчеркивания.
     Длина password должна быть меньше 15 символов. Также password и
     confirmPassword должны быть равны. Если password не соответствует
     этим требованиям, необходимо выбросить WrongPasswordException.
      WrongPasswordException и WrongLoginException - пользовательские
     классы исключения с двумя конструкторами – один по умолчанию,
     второй принимает сообщение исключения и передает его в
     конструктор класса Exception. Обработка исключений проводится в
     методе main. Используем multi-catch block.
     */

    public static void main(String[] args) {
        String login = "";
        String password = "";
        String confirmPassword = "";
        while (true) {
            try {
                if (signUp(login, password, confirmPassword)) {
                break;
                }
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("sign up successfully");

    }

    public static boolean signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        boolean done = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter ur login ");

        login = sc.nextLine();

        if (!login.matches("\\w{4,19}")) {
            throw new WrongLoginException("Wrong login");

        }
        System.out.println("enter ur password");
        password = sc.nextLine();
        System.out.println("confirm ur password");
        confirmPassword = sc.nextLine();

        if (!(password.matches("\\w{1,14}") || !password.equals(confirmPassword))) {
            throw new WrongPasswordException("Wrong password");
        }
        done = true;
        return done;

    }

}
