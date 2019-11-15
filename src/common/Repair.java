package common;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Repair {

    public List <Repair> instances = new ArrayList<Repair>();

    private Car car; // Composition - If repair is destroyed - then the car within the repair is destroyed
    private List <Employee> employees; // Composition - If repair is destroyed - then the employees within the repair is destroyed
    private UUID uuid;

    public Repair() {

    }

    public void store(Car car) {
        Repair repair = new Repair();
        UUID uuid;
        uuid = UUID.randomUUID();

        repair.uuid = uuid;
        repair.car = car;

        instances.add(repair);
    }
}
