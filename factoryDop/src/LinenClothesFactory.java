public class LinenClothesFactory implements ClothesFactory{


    @Override
    public Shirt createShirt() {
        return new LinenShirt();
    }

    @Override
    public Pants createPants() {
        return new LinenPants();
    }
}
