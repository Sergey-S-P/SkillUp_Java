package com.skillup.classes.name_exception;

public class WrongNameException extends Exception{
    public WrongNameException(String message, int count) {
        super(message + count);
    }
}
