package try3;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Most Excellent Dark Roast";
    }

    @Override
    int cost() {
        return 250;
    }
}
