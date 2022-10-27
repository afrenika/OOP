package tr1;



public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer(amp);
        CdPlayer cdPlayer = new CdPlayer(amp);
        Projector projector = new Projector(dvdPlayer);
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        //начало
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


        //конец
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
}
