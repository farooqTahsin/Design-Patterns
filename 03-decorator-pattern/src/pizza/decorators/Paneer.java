package pizza.decorators;

import pizza.types.Pizza;

public class Paneer extends  ToppingDecorator {
    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public double cost() {
        return pizza.cost() + .30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Panner";
    }
}
