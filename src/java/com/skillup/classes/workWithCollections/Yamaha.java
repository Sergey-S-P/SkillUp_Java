package com.skillup.classes.workWithCollections;

public class Yamaha extends Motorbike{

    ClassesBike kls;

    public Yamaha(ClassesBike kls, String win, int numberCylinders, boolean injector) {
        this.kls = kls;
        this.win = win;
        this.numberCylinders = numberCylinders;
        this.injector = injector;
    }
}
