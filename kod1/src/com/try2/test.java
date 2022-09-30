package com.try2;

public class test {
    public static void main(String[] args) {
        Duck[] a = new Duck[]{new MallardDuck(), new RedheadDuck(), new RubberDuck(), new DecoyDuck()};
        for(Duck i:a){
            i.display();
            i.swim();
            System.out.println();
        }
        MallardDuck c = new MallardDuck();
        c.fly();
        c.quack();

        RedheadDuck b = new RedheadDuck();
        b.fly();
        b.quack();

        RubberDuck r = new RubberDuck();
        r.swim();
        r.quack();

        DecoyDuck d = new DecoyDuck();
        d.swim();
    }

}
