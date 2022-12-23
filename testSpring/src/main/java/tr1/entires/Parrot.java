package tr1.entires;

import org.springframework.stereotype.Component;

@Component("parrot-kesha")
public class Parrot {
    private String name = "чирик-чирик";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot(String name) {
        this.name = name;
    }

    public Parrot() {
    }
}
