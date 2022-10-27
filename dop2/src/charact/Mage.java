package charact;

public class Mage implements IClass, Observer{
    final int basicAutoAttack = 15;
    final int basicUltimateAbility = 70;
    final int basicHp = 6;
    private Subject sky;
    int skyModification;

    public Mage(Subject sky) {
        this.sky = sky;
        sky.registerObserver(this);

    }

    @Override
    public void autoAttack() {
        System.out.println("*пускает во врагов магические сгутки");
    }

    @Override
    public void ultimateAbility() {
        System.out.println("*вызывает вокруг себя магическую бурю*");
    }

    @Override
    public void myClass() {
        System.out.println("I'm mage.");
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
        return ((Character.modification(intelligence) * 22) + (Character.modification(constitution) * 10)) * skyModification;
    }

    @Override
    public void update() {
        if (sky.getMoonState() == MoonStates.newMoon) {skyModification = 2;}
        else if (sky.getMoonState() == MoonStates.growingMoon){skyModification = 1;}
        else if (sky.getMoonState() == MoonStates.fullMoon){skyModification = 5;}
        else if (sky.getMoonState() == MoonStates.waningMoon){skyModification = 3;}

        if (sky.getMagicTiltAngle() > 30){skyModification *= 2;}
    }
}
