public class Director {

    public void constructDinoToy(Builder builder) {
        builder.setColor("green");
        builder.setAnimalEars(null);
        builder.setAudioSpeaker(false);
        builder.setScallop(true);
        builder.setFangs(true);
        builder.setFilling(Wadding.sintepon);
        builder.setHairColor(null);
        builder.setLimbsCount(4);
        builder.setTail(true);
        builder.setMaterial(Material.fleece);
    }

    public void constructMusicDinoToy(Builder builder){
        constructDinoToy(builder);
        builder.setAudioSpeaker(true);
    }

    public void constructCatToy(Builder builder) {
        builder.setColor("black");
        builder.setAnimalEars(AnimalEarsType.catEars);
        builder.setAudioSpeaker(false);
        builder.setScallop(true);
        builder.setFangs(true);
        builder.setFilling(Wadding.foamRubber);
        builder.setHairColor(null);
        builder.setLimbsCount(4);
        builder.setTail(true);
        builder.setMaterial(Material.tulle);
    }

    public void constructMusicCatToy(Builder builder){
        constructCatToy(builder);
        builder.setAudioSpeaker(true);
    }

    public void constructGirlToy(Builder builder) {
        builder.setColor("beige");
        builder.setAnimalEars(null);
        builder.setAudioSpeaker(false);
        builder.setScallop(false);
        builder.setFangs(false);
        builder.setFilling(Wadding.sintepuh);
        builder.setHairColor("black");
        builder.setLimbsCount(4);
        builder.setTail(false);
        builder.setMaterial(Material.acrylic);
    }

    public void constructMusicGirlToy(Builder builder){
        constructGirlToy(builder);
        builder.setAudioSpeaker(true);
    }

}
