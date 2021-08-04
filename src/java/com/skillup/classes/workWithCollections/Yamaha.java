package com.skillup.classes.workWithCollections;

public class Yamaha extends Motorbike{

    ClassesBike classesBike;

    public Yamaha(ClassesBike classesBike, String win, int numberCylinders, boolean injector) {
        this.classesBike = classesBike;
        this.win = win;
        this.numberCylinders = numberCylinders;
        this.injector = injector;
    }
}
