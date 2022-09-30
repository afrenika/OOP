package try3;

public class Soy extends CondimentDecorator{
    @Override
    int cost() {
        return beverage.cost() + 150;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
}
