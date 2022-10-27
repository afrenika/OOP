package tr1;

public class PopcornPopper {


    public void on() {
        System.out.println("Машина для попкорна включена");
    }

    public void off() {
        System.out.println("Машина для попкорна выключена");
    }

    public void pop() {
        System.out.println("Создание попкорна");
    }

    @Override
    public String toString() {
        return "PopcornPopper";
    }
}
