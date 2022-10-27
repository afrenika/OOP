package tr2;

public class Tuner {
    Amplifier amplifier;

    public Tuner(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public Tuner() {
    }

    public void on() {
        System.out.println("Тюнер включен");
    }

    public void off() {
        System.out.println("Тюнер выключен");
    }

    public void setAm() {
        System.out.println("Включение AM режима");
    }

    public void setFm() {
        System.out.println("Включение FM режима");
    }

}
