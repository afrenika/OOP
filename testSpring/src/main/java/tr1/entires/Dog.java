package tr1.entires;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog {
    private String name = "dog";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
    }
}
