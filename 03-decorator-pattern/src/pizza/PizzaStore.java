package pizza;

/*
    The Decorator Pattern attaches additional responsibilities to an object dynamically.
    Decorators provide a flexible alternative to subclassing for extending functionality.
*/

import pizza.decorators.Barbeque;
import pizza.decorators.FreshTomato;
import pizza.types.ChickenFiesta;
import pizza.types.Margheritta;
import pizza.types.Pizza;

public class PizzaStore {
    public static void main(String[]args) {

        Pizza chickenWithBarbeque = new ChickenFiesta();
        chickenWithBarbeque = new Barbeque(chickenWithBarbeque);
        showItem(chickenWithBarbeque);

        Pizza margheritta = new Margheritta();
        margheritta = new FreshTomato(margheritta);
        showItem(margheritta);


    }
    private static void showItem(Pizza pizza) {
        System.out.println(pizza.getDescription() + ". Cost: $"+pizza.cost());
    }
}
