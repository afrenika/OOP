package try3;

public class test {
    public static void main(String[] args) {
        Beverage beverage = new Soy(new Whip(new Decaf()));
        System.out.println(beverage.getDescription());
        System.out.println("Стоимость = " + beverage.cost());
    }
}
