package tr4;

public class Test {

    public static void main(String[] args) {
            PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
            DinerMenu dinerMenu = new DinerMenu();
            CafeMenu cafeMenu = new CafeMenu();
            Waiter waitress = new Waiter(pancakeHouseMenu, dinerMenu, cafeMenu);
            waitress.printMenu();
    }
}
