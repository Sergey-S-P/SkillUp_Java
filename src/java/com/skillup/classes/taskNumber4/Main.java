package com.skillup.classes.taskNumber4;

public class Main {
    public static void main(String[] args) {
        Human uzik = new Human("Юзик", "Павлов", "мужчина", "роза");
        Human klara = new Human("Клара", "Смирнова", "женщина", " ");

        uzik.setFlower(flowerShop("тюльпан", 101));
        /*
        иначе говоря так:
        Flower someFlower = flowerShop("тюльпан", 101);
        uzik.setFlower(someFlower);
        */

        uzik.hello();
        klara.hello();
        uzik.give();
        klara.setFlower(uzik.getFlower());
        klara.accept();
        klara.test();

    }

    public static Flower flowerShop(String name, int count){
        return new Flower(name, count);
    }
}
