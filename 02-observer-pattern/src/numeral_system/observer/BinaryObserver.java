package numeral_system.observer;

import numeral_system.observable.NumberingSystem;

public class BinaryObserver implements Observer {
    private NumberingSystem numberingSystem;

    public BinaryObserver(NumberingSystem numberingSystem) {
        this.numberingSystem = numberingSystem;
        this.numberingSystem.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Binary String: " +
                Integer.toBinaryString(numberingSystem.getState()));
    }
}
