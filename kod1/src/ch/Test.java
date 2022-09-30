package ch;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Chaaracter> arr = new ArrayList<>();
        arr.add(new King()); arr.add(new Knight());
        arr.add(new Queen()); arr.add(new Troll());
        for (Chaaracter i:arr) {
            i.fight();
            System.out.println();}
        arr.get(0).fight();
        arr.get(1).fight();
        System.out.println();


    }
}
