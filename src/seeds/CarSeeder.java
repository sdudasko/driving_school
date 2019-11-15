package seeds;

import common.Car;

import java.util.UUID;

public class CarSeeder implements Seedable {

    @Override
    public void seed() {

        // TODO - to 2d array and set props in loop

        Car.store("Mazda", 10000);
        Car.store("Opel", 12500);
        Car.store("Skoda", 800);
        Car.store("Petovo auto", 800);
        Car.store("Renault", 4500);
    }
}
