package ch;

public class Troll extends Chaaracter {
    @Override
    public void fight() {
        System.out.println("АРРРГХ!!");
        System.out.println("НЕ УЙДЕТЕ!");
        System.out.println("*вытаскивает оружие*");
        weapon.useWeapon();
    }

    public Troll() {
        weapon = new KnifeBehavior();
    }
}
