package try3;

public class HouseBlend extends Beverage {
    @Override
    int cost() {
        return 270;
    }

    public HouseBlend() {
        description = "Coffee that, that is good on it's own and pairs well.";
    }
}
