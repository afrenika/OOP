package tr2;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();

        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setCdPlayer(cdPlayer);
        amp.setDvdPlayer(dvdPlayer);
        amp.setSurroundSound();
        amp.setVolume(5);
        cdPlayer.on();
        dvdPlayer.on();
        cdPlayer.play();
        dvdPlayer.play();
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        cdPlayer.stop();
        cdPlayer.off();
        dvdPlayer.stop();
        dvdPlayer.off();
    }

    public void listenToRadio(){
        System.out.println("Подготовка к прослушиванию радио");
        amp.on();
        tuner.on();
        amp.setTuner(tuner);
        amp.setVolume(10);
        tuner.setFm();
        tuner.setAm();
    }
    public void endRadio(){
        System.out.println("Завершение прослушивания радио");
        amp.off();
        tuner.off();
    }
}
