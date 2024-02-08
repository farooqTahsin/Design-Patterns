package pizza.types;

public class Margheritta extends Pizza {
    public Margheritta() {
        description = "Margheritta Pizza with cheese";
    }
    @Override
    public double cost() {
        return 8.99;
    }
}
