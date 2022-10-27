package tr1;


public class Projector {
    DvdPlayer dvdPlayer;

    public Projector(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }


    public void on() {
        System.out.println("Прожектор включен");
    }

    public void off() {
        System.out.println("Прожектор выключен");
    }

    public void wideScreenMode() {
        System.out.println("in widescreen mode (16x9 aspect ratio)");
    }

    public void tvMode() {
        System.out.println("in tv mode (4x3 aspect ratio)");
    }

    @Override
    public String toString() {
        return "Projector";
    }
}
