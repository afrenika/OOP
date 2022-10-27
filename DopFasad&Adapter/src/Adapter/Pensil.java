package Adapter;

public class Pensil implements DrawingWithPensil{
    @Override
    public void drawingStraightLine(int pixel) {
        for (int i = 0; i < pixel; i++){
            System.out.print("_");}
        System.out.println();
    }

    @Override
    public void drawingWavyLine(int pixel) {
        for (int i = 0; i < pixel; i++){
        System.out.print("-/");}
        System.out.println();
    }

    @Override
    public void drawingDottedLine(int pixel) {
        for (int i = 0; i < pixel; i++){
        System.out.print("-");}
        System.out.println();
    }

}
