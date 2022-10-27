package charact;

public class Stupidity extends Effect{
    public Stupidity(Character character) {
        this.character = character;
    }

    @Override
    public byte getIntelligence() {
        return (byte) (character.getIntelligence() - 2);
    }

    @Override
    public byte getWisdom() {
        return (byte) (character.getWisdom() - 3);
    }

    @Override
    public byte getCharisma() {
        return (byte) (character.getCharisma() - 4);
    }

    @Override
    public String getEffectsPanel() {
        return character.getEffectsPanel() + "'stupidity' ";
    }
}
