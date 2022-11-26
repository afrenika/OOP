public interface Pants extends Clothes{
    @Override
    default void putOn(){
        System.out.println("расстегнуть пуговицы и ширинку, натянуть на одну ногу, затем на вторую, застегнуть пуговицу или ширинку, надеть при необходимости ремень");
    }
}
