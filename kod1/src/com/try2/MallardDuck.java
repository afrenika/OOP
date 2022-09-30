package com.try2;


public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    void display() {
        System.out.println("I'm MallardDuck.");
    }


    @Override
    public void fly() {
        System.out.println("Я летаю!");
    }

    @Override
    public void quack() {
        System.out.println("кря-кря");
    }
}
