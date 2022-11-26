public class Main {
    public static void main(String[] args) {
        ClothesFactory clothesFactory1 = new CottonClothesFactory();
        ClothesFactory clothesFactory2 = new LinenClothesFactory();

        Pants pants1 = clothesFactory1.createPants();
        Pants pants2 = clothesFactory2.createPants();

        Shirt shirt1 = clothesFactory1.createShirt();
        Shirt shirt2 = clothesFactory2.createShirt();

        pants1.putOn();
        pants2.putOn();
        pants1.getStructure();
        pants2.getStructure();
        pants1.wash();
        pants2.wash();
        System.out.println();
        shirt1.putOn();
        shirt2.putOn();
        shirt1.getStructure();
        shirt2.getStructure();
        shirt1.wash();
        shirt2.wash();

    }
}
