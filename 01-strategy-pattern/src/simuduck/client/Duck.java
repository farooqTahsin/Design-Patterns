package simuduck.client;


import simuduck.behavior.fly_behavior.FlyBehavior;
import simuduck.behavior.fly_behavior.FlyWithWings;
import simuduck.behavior.quack_behavior.Quack;
import simuduck.behavior.quack_behavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("Swim!");
    }
    public void display(){};
    public void performQuack() {
        quackBehavior.quack();
    }
    public void performFly() {
        flyBehavior.fly();
    }
    public void setFlyBehavior(FlyWithWings flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(Quack quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
