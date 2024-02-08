package pizza.types;

public class PeppyPaneer extends Pizza {
    public PeppyPaneer() {
        description = "Peppy Paneer Pizza with cheese";
    }
    @Override
    public double cost() {
        return 5.99;
    }
}
