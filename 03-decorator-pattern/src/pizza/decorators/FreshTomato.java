package pizza.decorators;

import pizza.types.Pizza;

public class FreshTomato extends ToppingDecorator {
    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public double cost() {
        return pizza.cost() + .40;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Fresh Tomato";
    }
}
