abstract public class Toy {

    protected String color;
    protected Material material;
    protected Wadding filling;
    protected Integer limbsCount;

    protected boolean audioSpeaker;
    protected AnimalEarsType animalEars;

    protected boolean scallop;
    protected boolean tail;
    protected boolean fangs;

    protected String hairColor;

    public Toy(String color, Material material, Wadding filling, Integer limbsCount, boolean audioSpeaker, AnimalEarsType animalEars, boolean scallop, boolean tail, boolean fangs, String hairColor) {
        this.color = color;
        this.material = material;
        this.filling = filling;
        this.limbsCount = limbsCount;
        this.audioSpeaker = audioSpeaker;
        this.animalEars = animalEars;
        this.scallop = scallop;
        this.tail = tail;
        this.fangs = fangs;
        this.hairColor = hairColor;
    }

    public abstract void printDescription();
    public abstract void stand();
}
