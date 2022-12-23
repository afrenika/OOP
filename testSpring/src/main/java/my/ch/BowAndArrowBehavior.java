package my.ch;

import org.springframework.stereotype.Component;

@Component("BOW")
public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("*звуки натяжения тетевы и... выстрел*");
    }
}
