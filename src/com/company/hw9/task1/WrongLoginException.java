package com.company.hw9.task1;

public class WrongLoginException extends  Exception{
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
