package starbuzz_with_sizes.decorators;

import starbuzz_with_sizes.types.Beverage;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        double cost = beverage.cost();
        if(beverage.getSize() == Size.SMALL) {
            cost+=.10;
        }
        else if(beverage.getSize() == Size.MEDIUM) {
            cost+=.15;
        }
        else if(beverage.getSize() == Size.LARGE) {
            cost+=.20;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
