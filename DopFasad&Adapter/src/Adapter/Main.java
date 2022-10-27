package Adapter;

public class Main {
    public static void main(String[] args) {
        DrawingWithPensil pensil = new Pensil();
        Artist artist = new Artist(pensil);
        artist.drawingMasterpiece();
        artist.trainingSkills();
        artist.studyOfReferences();
        artist.lunchBreak();
        System.out.println();
        DrawingWithPensil pensil1 = new AdapterMechanicalPensil(new MechanicalPensil());

        artist.setPensil(pensil1);

        artist.drawingMasterpiece();
        artist.trainingSkills();
    }

}
