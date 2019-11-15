package common;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Car {
    public UUID uuid;
    public String name;

    private int price;
    public List<Car> instances = new ArrayList<Car>();

    public Car() {

    }

    public static UUID store(String name, int price) {
        Car car = new Car();

        UUID uuid;
        uuid = UUID.randomUUID();

        car.uuid = uuid;
        car.name = name;
        car.price = price;

        CarStack.getInstance().add(car);

        return uuid;
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

    public String toString(Car car) {
        return "ads";
//        return "Name: " + car.name;
    }
}
