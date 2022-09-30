package com.try3;

public class test {
    public static void main(String[] args) {
        Duck [] a = new Duck[]{new MallardDuck(), new RedheadDuck(), new RubberDuck(), new DecoyDuck()};
        for(Duck i:a){
            i.display();
            i.swim();
            i.performQuack();
            i.performFly();
            System.out.println();
        }
    }

}
