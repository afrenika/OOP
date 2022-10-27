package Adapter;

public class AdapterMechanicalPensil implements DrawingWithPensil{
    MechanicalPencilIn mechanicalPencil;

    public AdapterMechanicalPensil(MechanicalPencilIn mechanicalPencil) {
        this.mechanicalPencil = mechanicalPencil;
    }

    @Override
    public void drawingStraightLine(int pixel) {
        mechanicalPencil.straightLine(pixel);
    }

    @Override
    public void drawingWavyLine(int pixel) {
        mechanicalPencil.wavyLine(pixel);
    }

    @Override
    public void drawingDottedLine(int pixel) {
        mechanicalPencil.dottedLine(pixel);
    }
}
