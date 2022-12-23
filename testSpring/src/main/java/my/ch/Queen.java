package my.ch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Queen")
public class Queen extends Chaaracter {


    @Override
    public void fight() {
        System.out.println("*делает реверанс*");
        System.out.println("*вытаскивает оружие*");
        weapon.useWeapon();
    }

    public Queen(@Qualifier("BOW") WeaponBehavior weaponBehavior) {
        weapon = weaponBehavior;
    }
}
