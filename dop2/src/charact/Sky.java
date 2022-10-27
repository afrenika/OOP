package charact;

import java.util.ArrayList;

public class Sky implements Subject{

    private ArrayList<Observer> observers;
    private int magicTiltAngle;
    private MoonStates moonStates;


    public Sky() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        o.update();
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers){
            o.update();
        }
    }

    @Override
    public MoonStates getMoonState() {
        return moonStates;
    }

    @Override
    public int getMagicTiltAngle() {
        return magicTiltAngle;
    }

    public void setMagicTiltAngle(int magicTiltAngle) {
        this.magicTiltAngle = magicTiltAngle;
    }

    public void setMoonStates(MoonStates moonStates) {
        this.moonStates = moonStates;
    }


    public void setData(int magicTiltAngle, MoonStates moonStates){
        this.magicTiltAngle = magicTiltAngle;
        this.moonStates = moonStates;
        notifyObservers();
    }

}
