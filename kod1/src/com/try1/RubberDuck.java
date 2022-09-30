package com.try1;

public class RubberDuck extends Duck{
    @Override
    void display() {
        System.out.println("I'm RubberDuck.");
    }

    @Override
    void quack() {
        System.out.println("писк-писк");}

    @Override
    void fly() {}
}
