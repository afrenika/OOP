package charact;

public class Warrior implements IClass{

    final int basicAutoAttack = 15;
    final int basicUltimateAbility = 70;
    final int basicHp = 10;

    @Override
    public void autoAttack() {
        System.out.println("наносит рубящие удары перед собой");
    }

    @Override
    public void ultimateAbility() {
        System.out.println("быстро кружится на месте, размахивая мечом");
    }

    @Override
    public void myClass() {
        System.out.println("I'm warrior.");
    }

    @Override
    public int getBasicAutoAttack() {
        return basicAutoAttack;
    }

    @Override
    public int getBasicUltimateAbility() {
        return basicUltimateAbility;
    }

    @Override
    public int getBasicHp() {
        return basicHp;
    }

    @Override
    public int magnification(byte strength, byte dexterity, byte constitution, byte intelligence, byte wisdom, byte charisma) {
        return Character.modification(strength) * 19 + Character.modification(constitution) * 12;
    }
}
