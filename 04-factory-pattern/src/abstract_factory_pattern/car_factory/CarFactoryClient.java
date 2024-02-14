package abstract_factory_pattern.car_factory;

import abstract_factory_pattern.car_factory.creator.CarFactory;
import abstract_factory_pattern.car_factory.creator.EuropeCarFactory;
import abstract_factory_pattern.car_factory.creator.NorthAmericaCarFactory;
import abstract_factory_pattern.car_factory.product.Car;
import abstract_factory_pattern.car_factory.product.CarSpecification;

public class CarFactoryClient {

    public static void main(String[] args) {
        // Creating cars for North America
        CarFactory northAmericaFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaFactory.createCar();
        CarSpecification northAmericaSpec = northAmericaFactory.createSpecification();

        northAmericaCar.assemble();
        northAmericaSpec.display();

        // Creating cars for Europe
        CarFactory europeFactory = new EuropeCarFactory();
        Car europeCar = europeFactory.createCar();
        CarSpecification europeSpec = europeFactory.createSpecification();

        europeCar.assemble();
        europeSpec.display();
    }
}
