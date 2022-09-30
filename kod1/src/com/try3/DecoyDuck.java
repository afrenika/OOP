package com.try3;


public class DecoyDuck extends Duck {

    @Override
    void display() {
        System.out.println("I'm DecoyDuck.");
    }

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
}
