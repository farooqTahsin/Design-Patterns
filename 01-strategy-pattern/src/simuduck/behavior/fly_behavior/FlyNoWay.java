package simuduck.behavior.fly_behavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Can't Fly!");
    }
}
