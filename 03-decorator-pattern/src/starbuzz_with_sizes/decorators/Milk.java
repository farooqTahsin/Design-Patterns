package starbuzz_with_sizes.decorators;

import starbuzz_with_sizes.types.Beverage;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
