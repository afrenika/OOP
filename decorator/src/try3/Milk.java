package try3;

public class Milk extends CondimentDecorator{
    @Override
    int cost() {
        return beverage.cost() + 50;
    }

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
