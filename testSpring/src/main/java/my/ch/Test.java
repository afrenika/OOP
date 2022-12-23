package my.ch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tr1.Example;
import tr3.Main;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("my.ch");
        BowAndArrowBehavior bowAndArrowBehavior = ctx.getBean(BowAndArrowBehavior.class);
        Queen queen = (Queen) ctx.getBean("Queen", Chaaracter.class);
        queen.fight();



    }

}
