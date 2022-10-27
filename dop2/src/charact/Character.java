package charact;

public abstract class Character{
    private String name;
    protected int hp;
    private char gender = 'n';
    private int level = 1;

    private String effectsPanel = "";


    private byte strength;
    private byte dexterity;
    private byte constitution;
    private byte intelligence;
    private byte wisdom;
    private byte charisma;


    private IClass classOfCharacter;

    protected Character() {
    }

    private void randStats(){
        strength = randStat();
        dexterity = randStat();
        constitution = randStat();
        intelligence = randStat();
        wisdom = randStat();
        charisma = randStat();
    }
    private byte randStat(){
        byte m1 = 0, m2 = 0, m3 = 0, rand;
        for (int i = 0; i < 4; i++) {
            rand = (byte) (Math.random()*6+1);
            if (rand > m1) m1 = rand;
            else if (rand > m2) m2 = rand;
            else if (rand > m3) m3 = rand;}
        return (byte) (m1 + m2 + m3);

    }

    public void myName(){
        System.out.println("My name is " + name + "\n" + "My level - " + level);
    }

    public void printAllCharacteristic(){
        System.out.println("s: " + getStrength());
        System.out.println("d: " + getDexterity());
        System.out.println("c: " + getConstitution());
        System.out.println("i: " + getIntelligence());
        System.out.println("w: " + getWisdom());
        System.out.println("ch: " + getCharisma());
    }

    public Character(String name, char gender, int level, IClass classOfCharacter) {
        this.name = name;
        this.gender = gender;
        this.level = level;
        this.classOfCharacter = classOfCharacter;
        randStats();
    }

    public void fight(){
        classOfCharacter.autoAttack();
        System.out.println("было нанесено - " + autoAttack());
        classOfCharacter.ultimateAbility();
        System.out.println("было нанесено - " + ultimateAttack());
    }

    public int autoAttack(){
        return classOfCharacter.getBasicAutoAttack() + dopDamage();
    }
    protected int dopDamage(){
        return (level - 1) * 500 + classOfCharacter.magnification(getStrength(), getDexterity(), getConstitution(), getIntelligence(), getWisdom(), getCharisma());
    }
    public int ultimateAttack(){
        return classOfCharacter.getBasicUltimateAbility() + dopDamage();
    }

    public static byte modification(byte i){
        return (byte) (i / 2 - 5);
    }


    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public char getGender() {
        return gender;
    }

    public int getLevel() {
        return level;
    }

    public byte getStrength() {
        return strength;
    }

    public byte getDexterity() {
        return dexterity;
    }

    public byte getConstitution() {
        return constitution;
    }

    public byte getIntelligence() {
        return intelligence;
    }

    public byte getWisdom() {
        return wisdom;
    }

    public byte getCharisma() {
        return charisma;
    }

    public IClass getClassOfCharacter() {
        return classOfCharacter;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setClassOfCharacter(IClass classOfCharacter) {
        this.classOfCharacter = classOfCharacter;
    }


    public String getEffectsPanel() {
        return effectsPanel;
    }

    protected void setStrength(byte strength) {
        this.strength = strength;
    }

    protected void setDexterity(byte dexterity) {
        this.dexterity = dexterity;
    }

    protected void setConstitution(byte constitution) {
        this.constitution = constitution;
    }

    protected void setIntelligence(byte intelligence) {
        this.intelligence = intelligence;
    }

    protected void setWisdom(byte wisdom) {
        this.wisdom = wisdom;
    }

    protected void setCharisma(byte charisma) {
        this.charisma = charisma;
    }

    public void levelUp(){
        level ++;
    }
}
