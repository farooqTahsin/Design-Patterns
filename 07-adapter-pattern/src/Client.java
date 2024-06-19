
public class Client {

    public static void main(String[]args) {

        Turkey turkey = new Turkey();
        turkey.fly();
        turkey.gobble();

        System.out.println("---------------------------");

        Duck duck = new TurkeyAdapter(turkey);
        duck.fly();
        duck.quack();
    }
}
