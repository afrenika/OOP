package try1;

public class Espresso extends Beverage{
    @Override
    int cost() {
      return 200;
    }

    public Espresso() {
        description = "Espresso is a Italian coffee-brewing method.";
    }
}
