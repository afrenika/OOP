public class CottonClothesFactory implements ClothesFactory{
    @Override
    public Shirt createShirt() {
        return new CottonShirt();
    }

    @Override
    public Pants createPants() {
        return new CottonPants();
    }
}
