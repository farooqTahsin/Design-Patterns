package factory_pattern.pizza_store;

import factory_pattern.pizza_store.creator.ChicagoPizzaStore;
import factory_pattern.pizza_store.creator.NYPizzaStore;
import factory_pattern.pizza_store.creator.PizzaStore;
import factory_pattern.pizza_store.product.Pizza;

public class PizzaTestDrive {
 
	public static void main(String[] args) {

		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Farooq ordered a " + pizza.getName());

		System.out.println("#####################################################");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Jad ordered a " + pizza.getName());
	}
}
