package charact;

abstract public class Effect extends Character {
    Character character;

    @Override
    public abstract String getEffectsPanel();

    @Override
    public void myName() {
        character.myName();
    }

    @Override
    public void printAllCharacteristic() {
        System.out.println("s: " + getStrength());
        System.out.println("d: " + getDexterity());
        System.out.println("c: " + getConstitution());
        System.out.println("i: " + getIntelligence());
        System.out.println("w: " + getWisdom());
        System.out.println("ch: " + getCharisma());
    }


    @Override
    public void fight() {
        getClassOfCharacter().autoAttack();
        System.out.println("было нанесено - " + autoAttack());
        getClassOfCharacter().ultimateAbility();
        System.out.println("было нанесено - " + ultimateAttack());
    }

    @Override
    public int autoAttack() {
        return getClassOfCharacter().getBasicAutoAttack() + dopDamage();
    }


    @Override
    protected int dopDamage(){
        return (getLevel() - 1) * 500 + getClassOfCharacter().magnification(getStrength(), getDexterity(), getConstitution(), getIntelligence(), getWisdom(), getCharisma());
    }

    @Override
    public int ultimateAttack() {
        return getClassOfCharacter().getBasicUltimateAbility() + dopDamage();
    }

    @Override
    public String getName() {
        return character.getName();
    }

    @Override
    public int getHp() {
        return character.getHp();
    }

    @Override
    public char getGender() {
        return character.getGender();
    }

    @Override
    public int getLevel() {
        return character.getLevel();
    }

    @Override
    public byte getStrength() {
        return character.getStrength();
    }

    @Override
    public byte getDexterity() {
        return character.getDexterity();
    }

    @Override
    public byte getConstitution() {
        return character.getConstitution();
    }

    @Override
    public byte getIntelligence() {
        return character.getIntelligence();
    }

    @Override
    public byte getWisdom() {
        return character.getWisdom();
    }

    @Override
    public byte getCharisma() {
        return character.getCharisma();
    }

    @Override
    public IClass getClassOfCharacter() {
        return character.getClassOfCharacter();
    }


    @Override
    public void setClassOfCharacter(IClass classOfCharacter) {
        character.setClassOfCharacter(classOfCharacter);
    }
}
