package try1;


public class test {
    public static void main(String[] args) {
        Beverage b = new DecafWithMilk();
        System.out.println(b.getDescription());
        System.out.println(b.cost());
    }
}
