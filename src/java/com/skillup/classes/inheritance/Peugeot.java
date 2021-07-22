package com.skillup.classes.inheritance;

public class Peugeot extends Car{

    public Peugeot(String body, int maxSpeed, boolean aWd, double price) {
        this.body = body;
        this.maxSpeed = maxSpeed;
        this.aWd = aWd;
        this.price = price;
    }

    @Override
    public String drive() {
        return "oh, go...";
    }
}
