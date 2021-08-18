package com.skillup.classes.enam;

public class ZooShop {

    public Dog getDogFromZooShop (DogBreed dogBreed){
        return zooShop(dogBreed);
    }

    private Dog zooShop (DogBreed breed) {

        switch (breed) {
            case  CHIHUAHUA:
                return new Chihuahua(DogColoring.BEIGE, 1500, false);
            case DACHSHUND:
                return new Dachshund(DogColoring.BLACK, 3000, false);
            case LABRADOR:
                return new Labrador(DogColoring.BROWN, 25000, true);
            default:
                return new Dachshund(DogColoring.BLACK, 2000, true);
        }
    }
}
