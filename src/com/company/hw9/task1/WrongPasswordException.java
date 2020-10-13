package com.company.hw9.task1;

public class WrongPasswordException extends  Exception{
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
