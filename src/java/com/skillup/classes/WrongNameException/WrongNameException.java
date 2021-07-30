package com.skillup.classes.WrongNameException;

public class WrongNameException extends Exception{
    public WrongNameException(String message, int count) {
        super(message + count);
    }
}
