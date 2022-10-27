package charact;

public interface Subject {
    void registerObserver(Observer o);
    void  removeObserver(Observer o);
    void notifyObservers();

    MoonStates getMoonState();
    int getMagicTiltAngle();
}
