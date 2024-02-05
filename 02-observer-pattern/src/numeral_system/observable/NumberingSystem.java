package numeral_system.observable;


import numeral_system.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class NumberingSystem implements Subject {
    private List<Observer> observers;
    private int state;

    public NumberingSystem() {
        this.observers = new ArrayList<>();
    }
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deAttach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers)
            observer.update();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
}
