package pizza.types;

public class ChickenFiesta extends Pizza {
    public ChickenFiesta() {
        description = "Chicken Fiesta Pizza with cheese";
    }
    @Override
    public double cost() {
        return 10.99;
    }
}
