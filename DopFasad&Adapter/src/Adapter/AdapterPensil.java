package Adapter;

public class AdapterPensil implements MechanicalPencilIn{
    DrawingWithPensil pensil;

    public AdapterPensil(DrawingWithPensil pensil) {
        this.pensil = pensil;
    }

    @Override
    public void straightLine(int pixel) {
        System.out.println("шершаво");
        pensil.drawingStraightLine(pixel);
    }

    @Override
    public void wavyLine(int pixel) {
        System.out.println("медленно");
        pensil.drawingWavyLine(pixel);
    }

    @Override
    public void dottedLine(int pixel) {
        pensil.drawingDottedLine(pixel);
    }
}
