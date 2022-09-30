package try1;

public class Decaf extends Beverage{

    @Override
    int cost() {
        return 300;
    }

    public Decaf() {
        description = "Decaf is the same as regular coffee? but has a majority of it's caffeine removed.";
    }
}
