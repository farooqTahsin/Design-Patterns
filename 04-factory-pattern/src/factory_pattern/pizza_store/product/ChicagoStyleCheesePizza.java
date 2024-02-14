package factory_pattern.pizza_store.product;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() { 
		name = "Chicago Style Deep Dish Cheese factor_pattern.pizza_store.product.Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		toppings.add("Shredded Mozzarella Cheese");
	}
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
