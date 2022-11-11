package tr3;

public class Test {

    public static void main(String[] args) {
            PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
            DinerMenu dinerMenu = new DinerMenu();
            Waiter waitress = new Waiter(pancakeHouseMenu, dinerMenu);
            waitress.printMenu();
    }
}
