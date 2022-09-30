package ch;

public class Queen extends Chaaracter {

    @Override
    public void fight() {
        System.out.println("*делает реверанс*");
        System.out.println("*вытаскивает оружие*");
        weapon.useWeapon();
    }

    public Queen() {
        weapon = new BowAndArrowBehavior();
    }
}
