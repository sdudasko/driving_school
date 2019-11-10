import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Car {
    private UUID id;
    private String name;
    public List<Car> instances = new ArrayList<Car>();

    public Car() {

    }

    public Car store(String name) {
        UUID $id;
        $id = UUID.randomUUID();
        instances.add(this);

        this.id = $id;
        this.name = name;

        return this.show($id);
    }

    public Car show(UUID $id) {

        int i = 0;
        for (Car $car : instances) {
            System.out.println($car.name);
            i++;
        }

        return this;
    }
}
