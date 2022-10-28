package tr3_2;
//условная блокировка
//При отсутствии ограничений по производительности условная блокировка выглядит как перебор.
// Также не забудьте убедиться в том, что вы используете как минимум Java 5

import tr1.Singleton;

public class ChocolateBoiler {

    private static volatile ChocolateBoiler unChocolateBoiler;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;}

    public static ChocolateBoiler getInstance(){
        if (unChocolateBoiler == null){
            synchronized (Singleton.class){
                if (unChocolateBoiler == null) {
                    unChocolateBoiler = new ChocolateBoiler();}}

    }
        return unChocolateBoiler;}


    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // Заполнение нагревателя молочно-шоколадной смесью
        }
    }
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // Слить нагретое молоко и шоколад
            empty = true;
        }
    }
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // Довести содержимое до кипения
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
