package starbuzz_with_sizes;

/*
    The Decorator Pattern attaches additional responsibilities to an object dynamically.
    Decorators provide a flexible alternative to subclassing for extending functionality.
*/

import starbuzz_with_sizes.decorators.Milk;
import starbuzz_with_sizes.types.*;
import starbuzz_with_sizes.decorators.Mocha;
import starbuzz_with_sizes.decorators.Soy;
import starbuzz_with_sizes.decorators.Whip;

public class StarbuzzCoffee {
    public static void main (String[]args) {
        Beverage beverage = new Decaf();
        showItem(beverage);

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Milk(beverage2);
        beverage2 = new Whip(beverage2);
        showItem(beverage2);

        Beverage beverage3 = new DarkRoast();
        beverage3.setSize(Beverage.Size.MEDIUM);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        showItem(beverage3);

    }
    private static void showItem(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $"+beverage.cost());
    }
}
