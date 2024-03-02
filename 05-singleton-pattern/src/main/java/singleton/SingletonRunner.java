package singleton;

public class SingletonRunner {

    public static void main(String args[]) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();

        boiler.fill();
        System.out.println(boiler.isEmpty());
        System.out.println(boiler2.isEmpty());

        boiler.boil();
        System.out.println(boiler.isBoiled());
        System.out.println(boiler2.isBoiled());

        boiler.drain();
        System.out.println(boiler.isEmpty());
        System.out.println(boiler2.isEmpty());

    }
}
