package com.skillup.classes.dogsWithEnam;

public class Dachshund extends Dogs{

    public Dachshund(DogColoring coloring, int weight, boolean longHair) {
        this.coloring = coloring;
        this.weight = weight;
        this.longHair = longHair;
    }

    @Override
    public String toSwim() {
        return "She doesn't like to swim!";
    }


}
