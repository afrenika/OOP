package try3;

public class Mocha extends CondimentDecorator{
    @Override
    int cost() {
        return beverage.cost() + 100;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
}
