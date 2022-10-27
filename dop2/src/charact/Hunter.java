package charact;

public class Hunter implements IClass{
    final int basicAutoAttack = 18;
    final int basicUltimateAbility = 66;
    final int basicHp = 8;

    @Override
    public void autoAttack() {
        System.out.println("производит два коротких выстрела перед собой");
    }

    @Override
    public void ultimateAbility() {
        System.out.println("запускает шквал стрел сверху на врагов перед собой");
    }

    @Override
    public void myClass() {
        System.out.println("I'm hunter.");
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
        return Character.modification(dexterity) * 25 + Character.modification(constitution) * 10;
    }
}
