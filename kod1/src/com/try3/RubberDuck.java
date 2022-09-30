package com.try3;



public class RubberDuck extends Duck {
    @Override
    void display() {
        System.out.println("I'm RubberDuck.");
    }

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

}
