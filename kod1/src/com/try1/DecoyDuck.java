package com.try1;

public class DecoyDuck extends Duck{

    @Override
    void display() {
        System.out.println("I'm DecoyDuck.");
    }

    @Override
    void quack() {}

    @Override
    void fly() {}
}
