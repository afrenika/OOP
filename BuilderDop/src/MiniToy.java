public class MiniToy extends Toy {

    public MiniToy(String color, Material material, Wadding filling, Integer limbsCount, boolean audioSpeaker, AnimalEarsType animalEars, boolean scallop, boolean tail, boolean fangs, String hairColor) {
        super(color, material, filling, limbsCount, audioSpeaker, animalEars, scallop, tail, fangs, hairColor);
    }

    @Override
    public void printDescription(){
        System.out.println("Информация о игрушке(мини версия)");
        System.out.println("Цвет - " + color);
        System.out.println("Материал - " + material);
        System.out.println("Наполнение - " + filling);
        if(audioSpeaker)System.out.println("Имеется звуковой динамик");
        if (animalEars != null)System.out.println("Имеются уши - " + animalEars.name());
        if (scallop)System.out.println("Имеется гребешок");
        if (tail) System.out.println("Имеется хвост");
        if(fangs) System.out.println("Имеются клыки");
        if(hairColor!= null) System.out.println("Цвет волос " + hairColor);
    }

    @Override
    public void stand(){
        System.out.println("Поставить в маленькую стойку");
    }
}
