package numeral_system.observable;


import numeral_system.observer.Observer;

public interface Subject {
    void attach(Observer observer);
    void deAttach(Observer observer);
    void notifyObservers();
}
