package com.skillup.classes.dogsWithEnam;

public class Chihuahua extends Dogs{

    public Chihuahua(DogColoring coloring, int weight, boolean longHair) {
        this.coloring = coloring;
        this.weight = weight;
        this.longHair = longHair;
    }
    @Override
    public String dogsSey () {
        return "TYAV-TYAV";
    }

    @Override
    public String toSwim() {
        return "She doesn't like to swim!";
    }

    @Override
    public String climbDownHoleForFox() {
        return "She doesn't hunt fox!";
    }
}

