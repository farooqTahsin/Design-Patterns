package abstract_factory_pattern.car_factory.creator;

import abstract_factory_pattern.car_factory.product.Car;
import abstract_factory_pattern.car_factory.product.CarSpecification;
import abstract_factory_pattern.car_factory.product.EuropeSpecification;
import abstract_factory_pattern.car_factory.product.Hatchback;

public class EuropeCarFactory implements CarFactory {

    public Car createCar() {
        return new Hatchback();
    }

    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}
