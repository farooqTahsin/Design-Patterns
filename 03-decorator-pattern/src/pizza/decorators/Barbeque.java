package pizza.decorators;

import pizza.types.Pizza;

public class Barbeque extends ToppingDecorator {
    public Barbeque(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public double cost() {
        return pizza.cost() + .25;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Barbeque";
    }
}
