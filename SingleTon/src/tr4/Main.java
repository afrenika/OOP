package tr4;

public class Main {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.UNIQUE_INSTANCE;
        boiler.fill();
        boiler.boil();
        boiler.drain();

    }
}
