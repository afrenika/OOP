package tr3_1;
//раннее создание экземпляра
//Экземпляр нагревателя в нашем приложении необходим всегда, и ранняя инициализация не создаст проблем.
//Решение работает так же хорошо, как и синхронизация метода, хотя, возможно, оно будет менее очевидным для разработчика,
// знакомого со стандартным паттерном.
public class ChocolateBoiler {

    private static ChocolateBoiler unChocolateBoiler = new ChocolateBoiler();
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;}

    public static ChocolateBoiler getInstance(){
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
