package my.ch;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("King")
public class King extends Chaaracter {

    @Override
    public void fight() {
        System.out.println("*дует в Рог*");
        System.out.println("*произносит боевой клич*");
        System.out.println("*вытаскивает оружие*");
        weapon.useWeapon();
    }

    public King(@Qualifier("AXE") WeaponBehavior weaponBehavior) {
        weapon = weaponBehavior;
    }
}
