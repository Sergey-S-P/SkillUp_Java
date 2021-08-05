package com.skillup.classes.workWithCollections;

import java.util.LinkedList;
import java.util.List;

public class MotoSalon {

    public Motorbike getBikeFromSalon (ModelBike model){
        return motoSalon(model);
    }

    public Motorbike motoSalon (ModelBike model) {

        switch (model){
            case YAMAHAR1:
                return new Motorbike(ClassesBike.SPORT, "1HFRC29A8TA382001", 4, true);
            case KTMEXC250:
                return new Motorbike(ClassesBike.ENDURO, "3HFRC29A8TA382003", 1, false);
            default:
                return new Motorbike(ClassesBike.STREET, "2HFRC29A8TA382002", 4, false);
        }



    }
}