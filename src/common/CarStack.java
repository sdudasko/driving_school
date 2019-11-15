package common;

import java.util.ArrayList;
import java.util.List;

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
        instances.add(car);
    }

    public List<Car> getCars() {
        return this.instances;
    }
}
