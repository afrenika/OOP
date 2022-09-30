package ch;

public class King extends Chaaracter {
    public King() {
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("*дует в Рог*");
        System.out.println("*произносит боевой клич*");
        System.out.println("*вытаскивает оружие*");
        weapon.useWeapon();
    }
}
