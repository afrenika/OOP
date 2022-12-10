public class Main {

    public static void main(String[] args) {
	MiniToyBuilder miniToyBuilder = new MiniToyBuilder();
    LargeToyBuilder largeToyBuilder = new LargeToyBuilder();
    Director director = new Director();
    director.constructDinoToy(miniToyBuilder);
    director.constructGirlToy(largeToyBuilder);
    MiniToy miniToy = miniToyBuilder.getResult();
    LargeToy largeToy = largeToyBuilder.getResult();

    miniToy.printDescription();
    miniToy.stand();
        System.out.println();
    largeToy.printDescription();
    largeToy.stand();
    }
}
