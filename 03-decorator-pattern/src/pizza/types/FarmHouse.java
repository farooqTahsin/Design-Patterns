package pizza.types;

public class FarmHouse extends Pizza {

    public FarmHouse() {
        description = "Farm House Pizza with cheese";
    }

    @Override
    public double cost() {
        return 7.99;
    }
}
