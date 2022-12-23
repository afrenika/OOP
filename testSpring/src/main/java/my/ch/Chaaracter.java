package my.ch;

import org.springframework.beans.factory.annotation.Autowired;

abstract public class Chaaracter {

    public WeaponBehavior weapon;

    abstract public void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
