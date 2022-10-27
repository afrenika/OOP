package charact;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Sky sky = new Sky();
        sky.setData(66, MoonStates.fullMoon);

        ArrayList<Character> characters = new ArrayList<>();
        characters.add(new Human("Vivan", 'm', 2, new Mage(sky)));
        characters.add(new Elf("Bileb", 'm', 1, new Warrior()));
        characters.add(new Gnome("Vylatiana", 'w', 4,  new Priest(sky)));
        characters.add(new Orc("Maria", 'w',5, new Hunter()));

        for (Character character: characters){
            character.myName();
            character.fight();
            character.printAllCharacteristic();
            System.out.println();
        }
        System.out.println();
        characters.get(0).myName();
        System.out.println();
        characters.get(0).levelUp();
        characters.get(0).setClassOfCharacter(new Priest(sky));
        characters.get(0).myName();
        System.out.println();


        characters.get(0).printAllCharacteristic();
        System.out.println();
        characters.set(0, new BlessingOfTheAngels(characters.get(0)));
        characters.get(0).myName();
        characters.get(0).printAllCharacteristic();
        System.out.println(characters.get(0).getEffectsPanel());
        characters.set(0, new Stupidity(characters.get(0)));
        System.out.println(characters.get(0).getEffectsPanel());

    }
}
