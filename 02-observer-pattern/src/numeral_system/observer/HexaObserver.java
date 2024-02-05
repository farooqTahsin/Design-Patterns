package numeral_system.observer;

import numeral_system.observable.NumberingSystem;

public class HexaObserver implements Observer {
    private NumberingSystem numberingSystem;

    public HexaObserver(NumberingSystem numberingSystem) {
        this.numberingSystem = numberingSystem;
        this.numberingSystem.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Hexa String: " +
                Integer.toHexString(numberingSystem.getState()));
    }
}
