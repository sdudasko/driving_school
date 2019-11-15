package common;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CarStack {

    private static CarStack carStackInstance = null;
    private List<Car> instances = null;

    private CarStack() {
        instances = new ArrayList<Car>();
    }

    public static CarStack getInstance() {
        if (carStackInstance == null) {
            carStackInstance =  new CarStack();
        }
        return carStackInstance;
    }

    public void add(Car car) {
        System.out.println(car.uuid);
        instances.add(car);
    }

    public List<Car> getCars() {
        return this.instances;
    }

    public void getInformation(UUID uuid) {
        int i = 0;
        for (Car car : instances) {
            if (car.uuid.equals(uuid)) {
                System.out.println("Name: " + car.name);
            }
            i++;
        }
    }
}
