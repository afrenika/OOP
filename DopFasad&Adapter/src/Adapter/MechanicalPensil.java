package Adapter;

public class MechanicalPensil implements MechanicalPencilIn{
    @Override
    public void straightLine(int pixel) {
        System.out.println("прямые гордые линии");
        for (int i = 0; i < pixel; i++){
            System.out.print("_");}
        System.out.println();
    }

    @Override
    public void wavyLine(int pixel) {
        System.out.println("приятные волниcтые линии");
        for (int i = 0; i < pixel; i++){
            System.out.print("-/");}
        System.out.println();
    }

    @Override
    public void dottedLine(int pixel) {
        System.out.println("прекрасные пунктирные линии");
        for (int i = 0; i < pixel; i++){
            System.out.print("-");}
        System.out.println();
    }
}
