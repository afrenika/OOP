package my.ch;

import org.springframework.stereotype.Component;

@Component("AXE")
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("*взмах-взмах*");
    }
}
