package charact;

public class Elf extends Character{

    public Elf(String name, char gender, int level, IClass classOfCharacter) {
        super(name, gender, level, classOfCharacter);
        setDexterity((byte) (getDexterity() + 2));
        hp = classOfCharacter.getBasicHp() + modification(getConstitution());
    }
    @Override
    public void myName() {
        super.myName();
        System.out.println("I'm Elf. ");
        getClassOfCharacter().myClass();
    }
}
