package charact;

public interface IClass {
    public void autoAttack();
    public void ultimateAbility();

    public void myClass();

    public int getBasicAutoAttack();
    public int getBasicUltimateAbility();
    public int getBasicHp();

    public int magnification(byte strength, byte dexterity, byte constitution, byte intelligence, byte wisdom, byte charisma);
}
