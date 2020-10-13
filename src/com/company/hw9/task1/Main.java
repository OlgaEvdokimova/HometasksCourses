package com.company.hw9.task1;

import java.lang.invoke.WrongMethodTypeException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        try {
            signUp("Olga_123", "Olga_12", "Olga_123");
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e){
            System.out.println(e.getMessage());
        }

    }
    public static void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches("\\w{4,19}")){
            throw new WrongLoginException("Wrong login");
        }
        if (!(password.matches("\\w{1,14}") && password.equals(confirmPassword))){
            throw new WrongPasswordException("Wrong password");
        } else {
            System.out.println("sign up");
        }
    }
}
