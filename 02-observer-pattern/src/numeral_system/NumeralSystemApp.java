package numeral_system;

import numeral_system.observable.NumberingSystem;
import numeral_system.observer.BinaryObserver;
import numeral_system.observer.HexaObserver;
import numeral_system.observer.OctalObserver;

public class NumeralSystemApp {
    public static void main(String[]args) {

        NumberingSystem numberingSystem = new NumberingSystem();

        BinaryObserver binaryObserver = new BinaryObserver(numberingSystem);
        OctalObserver octalObserver = new OctalObserver(numberingSystem);
        HexaObserver hexaObserver = new HexaObserver(numberingSystem);

        System.out.println("First state change: 15");
        numberingSystem.setState(15);
        System.out.println();

        System.out.println("Second state change: 10");
        numberingSystem.setState(10);
        System.out.println();

        numberingSystem.deAttach(octalObserver);

        System.out.println("Third state change: 20");
        numberingSystem.setState(20);
        System.out.println();
    }
}
