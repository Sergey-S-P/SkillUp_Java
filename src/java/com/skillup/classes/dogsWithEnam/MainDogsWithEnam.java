package com.skillup.classes.dogsWithEnam;

public class MainDogsWithEnam {
    public static void main (String[] args) {

        ZooShop zooShop = new ZooShop();
        Dogs chita = zooShop.getDogFromZooShop(DogBreed.Chihuahua);
        Dogs beti = zooShop.getDogFromZooShop(DogBreed.Labrador);
        Dogs darsi = zooShop.getDogFromZooShop(DogBreed.Dachshund);

        System.out.println("This is Chita");
        System.out.println(chita.dogsSey());
        System.out.println(chita.toSwim());
        System.out.println(chita.climbDownHoleForFox());

        System.out.println("This is Beti");
        System.out.println(beti.dogsSey());
        System.out.println(beti.toSwim());
        System.out.println(beti.climbDownHoleForFox());

        System.out.println("This is Darsi");
        System.out.println(darsi.dogsSey());
        System.out.println(darsi.toSwim());
        System.out.println(darsi.climbDownHoleForFox());
    }
}
