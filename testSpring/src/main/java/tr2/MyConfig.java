package tr2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tr2.entires.Cat;
import tr2.entires.Dog;
import tr2.entires.Parrot;

@Configuration
public class MyConfig {


    @Bean
    public Dog getDog() {
        return new Dog();
    }

    @Bean("parrot-kesha")
    public Parrot weNeedMoreParrots() {
        return new Parrot();
    }
//

    @Bean("u")
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }
}