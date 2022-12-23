package tr1.entires;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name = "Барсик";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
