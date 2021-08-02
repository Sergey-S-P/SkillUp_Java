package com.skillup.classes.dogsWithEnam;

public class ZooShop {

    public Dogs getDogFromZooShop (DogBreed dogBreed){
        return zooShop(dogBreed);
    }

    private Dogs zooShop (DogBreed breed) {

        switch (breed) {
            case  Chihuahua:
                return new Chihuahua(DogColoring.Beige, 1500, false);
            case Dachshund:
                return new Dachshund(DogColoring.Black, 3000, false);
            case Labrador:
                return new Labrador(DogColoring.Brown, 25000, true);
            default:
                return new Dachshund(DogColoring.Black, 2000, true);
        }
    }
}
