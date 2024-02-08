package starbuzz;

/*
    The Decorator Pattern attaches additional responsibilities to an object dynamically.
    Decorators provide a flexible alternative to subclassing for extending functionality.
*/

import starbuzz.types.Beverage;
import starbuzz.decorators.Mocha;
import starbuzz.decorators.Soy;
import starbuzz.decorators.Whip;
import starbuzz.types.DarkRoast;
import starbuzz.types.Espresso;
import starbuzz.types.HouseBlend;

public class StarbuzzCoffee {

    public static void main (String[]args) {
        Beverage beverage = new Espresso();
        showItem(beverage);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        showItem(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        showItem(beverage3);
    }
    private static void showItem(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $"+beverage.cost());
    }

}
