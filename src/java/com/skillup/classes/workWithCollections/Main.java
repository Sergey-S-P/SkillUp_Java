package com.skillup.classes.workWithCollections;

public class Main {
    public static void main (String[] args){

        Yamaha r1 = new Yamaha(ClassesBike.SPORT, "1HFRC29A8TA382001", 4, true);
        Honda cb600f = new Honda(ClassesBike.STREET, "1HFRC29A8TA382002", 4, false);
        Ktm exc250 = new Ktm(ClassesBike.ENDURO, "1HFRC29A8TA382003", 1, false);

        System.out.println(r1.refuelGas());
        System.out.println(r1.drive());
        System.out.println(r1.takePassenger());

        System.out.println(" ");

        System.out.println(cb600f.refuelGas());
        System.out.println(cb600f.drive());
        System.out.println(cb600f.takePassenger());

        System.out.println(" ");

        System.out.println(exc250.refuelGas());
        System.out.println(exc250.drive());
        System.out.println(exc250.takePassenger());
    }
}
