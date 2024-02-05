package numeral_system.observer;

import numeral_system.observable.NumberingSystem;

public class OctalObserver implements Observer {
    private NumberingSystem numberingSystem;

    public OctalObserver(NumberingSystem numberingSystem) {
        this.numberingSystem = numberingSystem;
        this.numberingSystem.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Octal String: " +
                Integer.toOctalString(numberingSystem.getState()));
    }
}
