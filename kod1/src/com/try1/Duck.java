package com.try1;

abstract public class Duck {
    abstract void display();

    void quack() {
        System.out.println("кря-кря");
    }

    void swim(){
        System.out.println("Я плаваю.");
    }

    void fly() {
        System.out.println("Я летаю!");
    }

}
