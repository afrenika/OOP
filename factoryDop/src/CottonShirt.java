public class CottonShirt implements Shirt{
    @Override
    public void wash() {
        System.out.println("в машинке, в режиме хлопок при 95 г для белых и не 60 для цветных, полоскать в щадящем режиме, не сушить в машинке");
    }

    @Override
    public void getStructure() {
        System.out.println("100% хлопок");
    }
}
