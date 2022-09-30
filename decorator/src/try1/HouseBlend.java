package try1;

public class HouseBlend extends Beverage{
    @Override
    int cost() {
        return 270;
    }

    public HouseBlend() {
        description = "Coffee that straight-forward, 'all day drinker'," +
                " that is good on it's own and pairs well with the milk and sugar.";
    }
}
