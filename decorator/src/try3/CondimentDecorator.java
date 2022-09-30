package try3;


abstract public class CondimentDecorator extends Beverage{
    Beverage beverage;

    @Override
    public abstract String getDescription();
}
