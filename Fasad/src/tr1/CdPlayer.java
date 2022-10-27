package tr1;

public class CdPlayer {
    Amplifier amplifier;

    public CdPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public CdPlayer() {
    }

    public void on() {
        System.out.println("CdPlayer включен");
    }
    public void off() {
        System.out.println("CdPlayer выключен");
    }


    public void eject() {
        System.out.println("Эффект применен");
    }

    public void play() {
        System.out.println("*проигрывание*");
    }


    public void stop() {
        System.out.println("Остановка проигрывания");
    }

    public void pause() {
        System.out.println("Проигрывание приостановлено");
    }

    @Override
    public String toString() {
        return "CdPlayer";
    }
}
