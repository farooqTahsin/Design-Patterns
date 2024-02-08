package pizza.decorators;

import pizza.types.Pizza;

public abstract class ToppingDecorator extends Pizza {
    Pizza pizza;
    public abstract String getDescription();
}
