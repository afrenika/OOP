package com.try1;

public class test {
    public static void main(String[] args) {
        Duck [] a = new Duck[]{new MallardDuck(), new RedheadDuck(), new RubberDuck(), new DecoyDuck()};
        for(Duck i:a){
            i.display();
            i.swim();
            i.fly();
            i.quack();
            System.out.println();
        }
    }

}
