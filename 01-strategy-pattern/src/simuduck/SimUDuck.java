package simuduck;

/*
    The Strategy Pattern defines a family of algorithms,
    encapsulates each one, and makes them interchangeable.
    Strategy lets the algorithm vary independently from
    clients that use it.
*/

import simuduck.behavior.fly_behavior.FlyWithWings;
import simuduck.behavior.quack_behavior.Quack;
import simuduck.client.DecoyDuck;
import simuduck.client.Duck;

public class SimUDuck {
    public static void main(String[]args) {
        Duck duck = new DecoyDuck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new Quack());
        duck.performFly();
        duck.performQuack();
        duck.swim();
        duck.display();
    }
}
