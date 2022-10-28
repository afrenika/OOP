package tr3;
//синхронизация метода
//Простое и заведомо рабочее решение. Хорошо подходит для нашей задачи, в которой нет проблем с быстродействием.
public class ChocolateBoiler {

    private static ChocolateBoiler unChocolateBoiler;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;}

    public static synchronized ChocolateBoiler getInstance(){
        if (unChocolateBoiler == null){
            unChocolateBoiler = new ChocolateBoiler();}
        return unChocolateBoiler;
    }


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
