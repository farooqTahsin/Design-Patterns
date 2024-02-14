package abstract_factory_pattern.car_factory.creator;

import abstract_factory_pattern.car_factory.product.Car;
import abstract_factory_pattern.car_factory.product.CarSpecification;
import abstract_factory_pattern.car_factory.product.NorthAmericaSpecification;
import abstract_factory_pattern.car_factory.product.Sedan;

public class NorthAmericaCarFactory implements CarFactory {

    public Car createCar() {
        return new Sedan();
    }

    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }
}
