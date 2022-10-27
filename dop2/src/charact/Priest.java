package charact;

public class Priest implements IClass, Observer{
    final int basicAutoAttack = 10;
    final int basicUltimateAbility = 40;
    final int basicHp = 8;
    private Subject sky;
    private int skyModification;

    public Priest(Subject sky) {
        this.sky = sky;
        sky.registerObserver(this);
        skyModification = 1;
    }

    public Subject getSky() {
        return sky;
    }

    public void setSky(Subject sky) {
        this.sky = sky;
    }

    @Override
    public void autoAttack() {
        System.out.println("наносит удар святой магией");
    }

    @Override
    public void ultimateAbility() {
        System.out.println("лечит всех дружественных персонажей, а врагов ослепляет на 5 секкунд");
    }

    @Override
    public void myClass() {
        System.out.println("I'm priest.");
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
        return (Character.modification(wisdom) * 20 + Character.modification(constitution) * 9) * skyModification;
    }

    @Override
    public void update() {
        if (sky.getMoonState() == MoonStates.newMoon) {skyModification = 5;}
        else if (sky.getMoonState() == MoonStates.growingMoon){skyModification = 4;}
        else if (sky.getMoonState() == MoonStates.fullMoon){skyModification = 1;}
        else if (sky.getMoonState() == MoonStates.waningMoon){skyModification = 2;}
    }
}
