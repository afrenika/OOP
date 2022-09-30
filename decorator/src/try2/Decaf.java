package try2;


public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf is the same as regular coffee? but has a majority of it's caffeine removed.";
    }

    @Override
    public double cost() {
        return super.cost() + 300;
    }
}
