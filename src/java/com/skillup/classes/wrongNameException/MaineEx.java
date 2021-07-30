package com.skillup.classes.wrongNameException;

public class MaineEx {
    public static void main(String[] args) {
        String name = "Jhon Trendy";
        try {
            System.out.println(isNameValid(name));
        } catch (WrongNameException e) {
            e.printStackTrace();
        }
    }

    public static boolean isNameValid (String name) throws WrongNameException {
        String[] s = name.split(" ");
        if (s.length <= 2) {
            return true;
        }
        throw new WrongNameException("Name wrong. Number of words is: ", s.length);
    }
}
