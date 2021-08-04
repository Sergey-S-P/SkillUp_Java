package com.skillup.classes.workWithCollections;

public class Honda extends Motorbike{

    ClassesBike classesBike;

    public Honda (ClassesBike classesBike, String win, int numberCylinders, boolean injector) {

        this.classesBike = classesBike;
        this.win = win;
        this.numberCylinders = numberCylinders;
        this.injector = injector;
    }
}
