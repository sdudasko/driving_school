package common;

import seeds.Seeder;

import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        new Seeder().seed();
        Repair storeRepairHandler = new Repair();

        CarStack storeHandler = CarStack.getInstance();

        List<Car> cars = CarStack.getInstance().getCars();
        System.out.println(cars.get(3).name);

        UUID uuid = UserInput.cta();

        Car car = new Car().show(uuid);
//        car.getInformation(car);
    }
}
