package tr2;

public class Main {
    public static void main(String[] args) {
        ChocolateBoiler boiler =
                ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
}
