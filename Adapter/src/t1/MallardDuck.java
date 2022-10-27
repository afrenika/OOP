package t1;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("кря-кря");
    }

    @Override
    public void fly() {
        System.out.println("я летаю");
    }
}
