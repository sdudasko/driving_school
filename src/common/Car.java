package common;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Car {
    private UUID uuid;

    private String name;
    private int price;
    public List<Car> instances = new ArrayList<Car>();

    public Car() {

    }

    public Car store(String name, int price) {
        Car car = new Car();

        UUID uuid;
        uuid = UUID.randomUUID();

        car.uuid = uuid;
        car.name = name;
        car.price = price;

        instances.add(car);
        System.out.println(car.uuid);

        return show(uuid);
    }

    public Car show(UUID id) {
        // TODO - ceknut, ci dostavame na vstup uuidcko
        int i = 0;
        for (Car car : instances) {
            if (car.uuid.equals(id)) {
                return car;
            }
            i++;
        }
        // TODO - Break program if car not found

        return null;
    }

    public void getInformation(Car car) {
        System.out.println("Name: " + car.name);
    }
}
