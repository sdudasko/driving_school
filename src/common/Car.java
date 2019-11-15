package common;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import stacks.CarStack;

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
}
