package com.skillup.classes.workWithCollections;

public class Ktm extends Motorbike{

    ClassesBike kls;

    public Ktm(ClassesBike kls, String win, int numberCylinders, boolean injector) {
        this.kls = kls;
        this.win = win;
        this.numberCylinders = numberCylinders;
        this.injector = injector;
    }


    @Override
    public String refuelGas() {
        return "The maximum fits 13 liters of gasoline in the tank!";
    }

    @Override
    public String drive() {
        return "let's go off-road!!!";
    }

    @Override
    public String takePassenger() {
        return "With a passenger is very dangerous!!!";
    }
}


// KTM 250 EXC