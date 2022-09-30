package com.try3;



public class RedheadDuck extends Duck {


    @Override
    void display() {
        System.out.println("I'm RedheadDuck.");
    }

    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
