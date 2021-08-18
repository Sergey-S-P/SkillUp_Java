package com.skillup.classes.enam;

public class MainDogWithEnam {
    public static void main (String[] args) {

        ZooShop zooShop = new ZooShop();
        Dog chita = zooShop.getDogFromZooShop(DogBreed.CHIHUAHUA);
        Dog beti = zooShop.getDogFromZooShop(DogBreed.LABRADOR);
        Dog darsi = zooShop.getDogFromZooShop(DogBreed.DACHSHUND);

        System.out.println("This is Chita");
        System.out.println(chita.dogSey());
        System.out.println(chita.toSwim());
        System.out.println(chita.climbDownHoleForFox());

        System.out.println("This is Beti");
        System.out.println(beti.dogSey());
        System.out.println(beti.toSwim());
        System.out.println(beti.climbDownHoleForFox());

        System.out.println("This is Darsi");
        System.out.println(darsi.dogSey());
        System.out.println(darsi.toSwim());
        System.out.println(darsi.climbDownHoleForFox());
    }
}
