package abstract_factory_pattern.car_factory.product;

public class NorthAmericaSpecification implements CarSpecification {

    public void display() {
        System.out.println("North America Car Specification: Safety features compliant with local regulations.");
    }
}
