package abstract_factory_pattern.car_factory.creator;

import abstract_factory_pattern.car_factory.product.Car;
import abstract_factory_pattern.car_factory.product.CarSpecification;

public interface CarFactory {

    Car createCar();
    CarSpecification createSpecification();
}
