package ch;

public class Knight extends Chaaracter {
    @Override
    public void fight() {
        System.out.println("За короля!");
        System.out.println("*вытаскивает оружие*");
        weapon.useWeapon();
    }

    public Knight() {
        weapon = new SwordBehavior();
    }
}
