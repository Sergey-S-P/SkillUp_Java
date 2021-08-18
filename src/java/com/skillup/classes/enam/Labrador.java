package com.skillup.classes.enam;

public class Labrador extends Dog {

    public Labrador(DogColoring coloring, int weight, boolean longHair) {
        this.coloring = coloring;
        this.weight = weight;
        this.longHair = longHair;
    }

    @Override
    public String climbDownHoleForFox() {
        return "She will feel the fox, but she will not climb into the hole!";
    }
}
