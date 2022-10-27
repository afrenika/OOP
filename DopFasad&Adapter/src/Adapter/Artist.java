package Adapter;

public class Artist {
    DrawingWithPensil pensil;

    public Artist(DrawingWithPensil pensil) {
        this.pensil = pensil;
    }

    public void setPensil(DrawingWithPensil pensil) {
        this.pensil = pensil;
    }

    public void drawingMasterpiece(){
        pensil.drawingDottedLine((int)(Math.random()*15));
        pensil.drawingStraightLine((int)(Math.random()*15));
        pensil.drawingWavyLine((int)(Math.random()*10));
    }

    public void trainingSkills(){
        System.out.println("усиленно штрихует круг");
        pensil.drawingDottedLine((int)(Math.random()*15));
    }


    public void studyOfReferences(){
        System.out.println("*Очень долго листается пинтрест*");
    }
    public void lunchBreak(){
        System.out.println("Работа работой, а обед по расписанию.");
    }
}
