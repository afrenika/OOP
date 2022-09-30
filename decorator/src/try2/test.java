package try2;

public class test {
    public static void main(String[] args) {
        Beverage b = new Espresso();
        b.setMilk();b.setSoy();
        System.out.println(b.getDescription());
        System.out.println("Стоимость = " + b.cost());
    }

}
