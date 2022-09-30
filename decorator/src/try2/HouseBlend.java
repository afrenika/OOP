package try2;


public class HouseBlend extends Beverage {
    @Override
    public double cost() {
        return super.cost() + 270;
    }

    public HouseBlend() {
        description = "Coffee that straight-forward, 'all day drinker'," +
                " that is good on it's own and pairs well with the milk and sugar.";
    }
}
