package common;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        Repair storeRepairHandler = new Repair();

        Car storeHandler = new Car();

        // TODO - to 2d array and set props in loop

        Car car = storeHandler.store("Mazda", 10000);
        storeRepairHandler.store(car);

        storeHandler.store("Opel", 12500);
        storeHandler.store("Skoda", 800);
        storeHandler.store("Renault", 4500);

        UUID uuid = UserInput.cta();

        Car newCar = storeHandler.show(uuid);

        storeHandler.getInformation(newCar);
    }
}
