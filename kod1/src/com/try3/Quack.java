package com.try3;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("кря-кря");
    }
}
