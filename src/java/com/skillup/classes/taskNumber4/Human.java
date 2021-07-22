package com.skillup.classes.taskNumber4;

public class Human {
    private String name;
    private String surname;
    private String manOrWoman;

    private Flower flower;

    public Human(String name, String surname, String manOrWoman, String flower) {
        this.name = name;
        this.surname = surname;
        this.manOrWoman = manOrWoman;
    }

    public String getName() {
        return name;
    }

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public void hello() {
        System.out.println("Привет, меня зовут " + name + " " + surname + "!");
    }

    public void give () {
        System.out.println("Я дарю тебе эти цветы!");
    }

    public void accept () {
        System.out.println("Спасибо!");
    }

    public void test () {
        System.out.println("Теперь у Клары " + getFlower().count + " " + getFlower().name);
        System.out.println("А у Юзика счастливое лицо!)");
    }
}
