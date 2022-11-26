public interface Shirt extends Clothes{

    @Override
    default void putOn(){
        System.out.println("расстегнуть пуговицы, надеть первый рукав, надеть второй рукав, застегнуть пуговицы, поправить воротник");
    }
}
