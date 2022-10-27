package tr1;

public class DvdPlayer {
    Amplifier amplifier;

    public DvdPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public DvdPlayer() {
    }

    public void on() {
        System.out.println("DvdPlayer включен");
    }
    public void off() {
        System.out.println("DvdPlayer выключен");
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

    public void setSurroundAudio(){
        System.out.println("Включение обьемного звука.");
    }
    public void setTwoChannelAudio(){
        System.out.println("Включение двухканального режима");
    }

    @Override
    public String toString() {
        return "DvdPlayer";
    }
}
