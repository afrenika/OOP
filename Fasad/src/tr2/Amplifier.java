package tr2;

public class Amplifier {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public Amplifier() {
    }

    public void on() {
        System.out.println("Усилитель включен");
    }

    public void off() {
        System.out.println("Усилитель выключен");
    }

    public void setStereoSound() {
        System.out.println("stereo mode включен");
    }

    public void setSurroundSound() {
        System.out.println("Обьемный звук включен (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int level) {
        System.out.println("Установление громкости - " + level);
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

}
