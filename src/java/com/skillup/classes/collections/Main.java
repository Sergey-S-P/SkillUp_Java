package com.skillup.classes.collections;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main (String[] args){

        MotoSalon motoSalon = new MotoSalon();

        Motorbike r1 = motoSalon.getBikeFromSalon(ModelBike.YAMAHAR1);
        Motorbike exc250 = motoSalon.getBikeFromSalon(ModelBike.KTMEXC250);
        Motorbike cb600 = motoSalon.getBikeFromSalon(ModelBike.HONDACB600);

        List<String> motoServiceTurn = new LinkedList<>();
        motoServiceTurn.add("0000");
        motoServiceTurn.add(exc250.win);
        motoServiceTurn.add(r1.getWin());
        motoServiceTurn.add(cb600.getWin());





        System.out.println(motoServiceTurn);


//        Motorbike yamahaR1 = new Motorbike(ClassesBike.SPORT, "1HFRC29A8TA382001", 4, true);
//        Motorbike hondaCb600 = new Motorbike(ClassesBike.STREET, "2HFRC29A8TA382002", 4, false);
//        Motorbike ktmExc250 = new Motorbike(ClassesBike.ENDURO, "3HFRC29A8TA382003", 1, false);

        System.out.println(r1.refuelGas());
        System.out.println(r1.drive());
        System.out.println(r1.takePassenger());





    }

}
