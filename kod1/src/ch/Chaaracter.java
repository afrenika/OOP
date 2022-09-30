package ch;

abstract public class Chaaracter {
    public WeaponBehavior weapon;
    abstract public void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
