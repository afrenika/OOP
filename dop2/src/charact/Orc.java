package charact;

public class Orc extends Character {
    public Orc(String name, char gender, int level, IClass classOfCharacter) {
        super(name, gender, level, classOfCharacter);
        setStrength((byte) (getStrength() + 2));
        setConstitution((byte) (getConstitution() + 1));
        hp = classOfCharacter.getBasicHp() + modification(getConstitution());
    }

    @Override
    public void myName() {
        super.myName();
        System.out.println("I'm Orc. ");
        getClassOfCharacter().myClass();
    }
}
