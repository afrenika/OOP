package tr2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tr2.entires.Cat;
import tr2.entires.Dog;
import tr2.entires.Parrot;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);
        Cat cat1 = context.getBean("u", Cat.class);
        Dog dog = context.getBean(Dog.class);


        System.out.println(cat1.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());
    }
}
