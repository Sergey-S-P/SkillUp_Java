package com.skillup.classes.inheritance;


public class Car {
    String body;
    int maxSpeed;
    boolean aWd;
    double price;

    public String drive() {
        return "go, go, go!!!";
    }

}


/*
SOLID
      (принцип единственной ответственности) один метод делает одно, без заказа пицци!
      (принцип открытости и закрытости) код открыт к дополнению но закрыт к модификации.
      (принцип Барбары Лисков) загуглить!)
      (разделение на интерфейсы) короткие примерно по 5 (методов или полей)
      (принцип обратной зависимоти)

KISS
      (keep it simple , stupid)
      (разделение на интерфейсы)

DRY
      (Don't repeat yourself)

*/



