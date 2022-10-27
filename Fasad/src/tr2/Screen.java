package tr2;

public class Screen {

    public void up() {
        System.out.println("Экран поднимается");
    }

    public void down() {
        System.out.println("Экран опускается");
    }

    @Override
    public String toString() {
        return "Screen";
    }
}
