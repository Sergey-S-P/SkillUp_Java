package com.skillup.classes.wrongNameException;

public class WrongNameException extends Exception{
    public WrongNameException(String message, int count) {
        super(message + count);
    }
}
