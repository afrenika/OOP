package charact;

public class ShackledByFetters extends Effect{
    public ShackledByFetters(Character character) {
        this.character = character;
    }

    @Override
    public byte getDexterity() {
        return (byte) (character.getDexterity() - 2);
    }

    @Override
    public byte getConstitution() {
        return (byte) (character.getConstitution() - 4);
    }

    @Override
    public String getEffectsPanel() {
        return character.getEffectsPanel() + "'shackled by fetters' ";
    }
}
