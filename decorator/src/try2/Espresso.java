package try2;


public class Espresso extends Beverage {
    @Override
    public double cost() {
      return super.cost() + 200;
    }

    public Espresso() {
        description = "Espresso is a Italian coffee-brewing method.";
    }
}
