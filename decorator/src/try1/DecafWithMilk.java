package try1;

public class DecafWithMilk extends Beverage{

    @Override
    int cost() {
        return 300 + 50;
    }

    public DecafWithMilk() {
        description = "Decaf is the same as regular coffee? but has a majority of it's caffeine removed. Now with milk";
    }
}
