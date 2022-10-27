package charact;

public class BlessingOfTheAngels extends Effect{
    public BlessingOfTheAngels(Character character) {
        this.character = character;
    }

    @Override
    public byte getStrength() {
        return (byte) (character.getStrength() + 5);
    }

    @Override
    public byte getDexterity() {
        return (byte) (character.getDexterity()  + 5);
    }

    @Override
    public byte getConstitution() {
        return (byte) (character.getConstitution() + 10);
    }

    @Override
    public byte getIntelligence() {
        return (byte) (character.getIntelligence() + 5);
    }

    @Override
    public byte getWisdom() {
        return (byte) (super.getWisdom() + 5);
    }

    @Override
    public byte getCharisma() {
        return (byte) (super.getCharisma() + 5);
    }

    @Override
    public String getEffectsPanel() {
        return character.getEffectsPanel() + "'blessing of the angels' ";
    }
}
