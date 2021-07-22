package com.skillup.classes.inheritance;

public class Main {
    public static void main (String[] args){
        Audi a3 = new Audi("sedan", 210, true, 35000.00);
        Peugeot p307 = new Peugeot("hatchback", 190, false, 27000.00);

        System.out.println(a3.drive());
        System.out.println(p307.drive());
    }
}
