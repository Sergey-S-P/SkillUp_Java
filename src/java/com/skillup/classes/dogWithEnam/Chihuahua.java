package com.skillup.classes.dogWithEnam;

public class Chihuahua extends Dog {

    public Chihuahua(DogColoring coloring, int weight, boolean longHair) {
        this.coloring = coloring;
        this.weight = weight;
        this.longHair = longHair;
    }
    @Override
    public String dogSey () {
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

