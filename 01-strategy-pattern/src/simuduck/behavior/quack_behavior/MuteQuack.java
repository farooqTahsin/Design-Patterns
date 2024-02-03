package simuduck.behavior.quack_behavior;


public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Can't Quack!");
    }
}
