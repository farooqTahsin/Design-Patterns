package pizza.decorators;

import pizza.types.Pizza;

public class Jalapeno extends ToppingDecorator {
    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public double cost() {
        return pizza.cost() + .10;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Jalapeno";
    }
}
