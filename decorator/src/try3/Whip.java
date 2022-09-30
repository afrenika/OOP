package try3;

public class Whip extends CondimentDecorator{
    @Override
    int cost() {
        return beverage.cost() + 80;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
}
