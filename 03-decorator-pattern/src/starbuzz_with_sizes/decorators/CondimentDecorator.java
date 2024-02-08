package starbuzz_with_sizes.decorators;

import starbuzz_with_sizes.types.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public abstract String getDescription();
    public Size getSize() {
        return beverage.getSize();
    }
}
