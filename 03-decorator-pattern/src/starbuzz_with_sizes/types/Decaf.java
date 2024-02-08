package starbuzz_with_sizes.types;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
