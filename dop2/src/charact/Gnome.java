package charact;

public class Gnome extends Character{
    public Gnome(String name, char gender, int level, IClass classOfCharacter) {
        super(name, gender, level, classOfCharacter);
        setIntelligence((byte) (getIntelligence() + 2));
        hp = classOfCharacter.getBasicHp() + modification(getConstitution());
    }

    @Override
    public void myName() {
        super.myName();
        System.out.println("I'm Gnome. ");
        getClassOfCharacter().myClass();
    }
}
