package charact;

public class Human extends Character{

    public Human(String name, char gender, int level, IClass classOfCharacter) {
        super(name, gender, level, classOfCharacter);
        setStrength((byte) (getStrength() + 1));
        setWisdom((byte) (getWisdom() + 1));
        setDexterity((byte) (getDexterity() + 1));
        setConstitution((byte) (getConstitution() + 1));
        setCharisma((byte) (getCharisma() + 1));
        setIntelligence((byte) (getIntelligence() + 1));
        hp = classOfCharacter.getBasicHp() + modification(getConstitution());
    }

    @Override
    public void myName() {
        super.myName();
        System.out.println("I'm Human. ");
        getClassOfCharacter().myClass();
    }


}
