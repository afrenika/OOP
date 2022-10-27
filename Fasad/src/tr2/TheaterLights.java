package tr2;

public class TheaterLights {

    public void on() {
        System.out.println("Свет включен");
    }

    public void off() {
        System.out.println("Свет выключен");
    }

    public void dim(int level) {
        System.out.println("Затемнение до уровня " + level);
    }

    @Override
    public String toString() {
        return "TheaterLights";
    }
}

