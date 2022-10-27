package tr2;

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
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvdPlayer, cdPlayer, projector, lights, screen, popper);


        homeTheater.watchMovie("Айгуль в стране чудес.");
        homeTheater.endMovie();
    }
}
