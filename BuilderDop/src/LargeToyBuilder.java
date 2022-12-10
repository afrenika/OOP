public class LargeToyBuilder implements Builder{
    private String color;
    private Material material;
    private Wadding filling;
    private Integer limbsCount;

    private boolean audioSpeaker;
    private AnimalEarsType animalEars;

    private boolean scallop;
    private boolean tail;
    private boolean fangs;

    private String hairColor;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setLimbsCount(int count) {
        limbsCount = count;
    }

    @Override
    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setFilling(Wadding filling) {
        this.filling = filling;
    }

    @Override
    public void setAudioSpeaker(boolean audioSpeaker) {
        this.audioSpeaker = audioSpeaker;
    }

    @Override
    public void setAnimalEars(AnimalEarsType animalEars) {
        this.animalEars = animalEars;
    }

    @Override
    public void setScallop(boolean scallop) {
        this.scallop = scallop;
    }

    @Override
    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public void setFangs(boolean fangs) {
        this.fangs = fangs;
    }


    @Override
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public LargeToy getResult() {
        return new LargeToy(color, material, filling, limbsCount, audioSpeaker, animalEars, scallop, tail, fangs, hairColor);
    }
}
