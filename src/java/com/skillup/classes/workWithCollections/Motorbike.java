package com.skillup.classes.workWithCollections;

import java.util.LinkedList;
import java.util.List;

public class Motorbike {

    String win;
    ClassesBike classesBike;
    int numberCylinders;
    boolean injector;

    public Motorbike(ClassesBike classesBike, String win,  int numberCylinders, boolean injector) {
        this.win = win;
        this.classesBike = classesBike;
        this.numberCylinders = numberCylinders;
        this.injector = injector;
    }


    public String getWin() {
        return win;
    }

    public ClassesBike getClassesBike() {
        return classesBike;
    }

    public int getNumberCylinders() {
        return numberCylinders;
    }

    public boolean isInjector() {
        return injector;
    }

    public String refuelGas () {
        return "The tank is full - we can go!";
    }

    public String drive() {
        return "GO!";
    }

    public String takePassenger () {
        return "Let's take a ride!";


    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "win='" + win + '\'' +
                ", classesBike=" + classesBike +
                ", numberCylinders=" + numberCylinders +
                ", injector=" + injector +
                '}';
    }

}


