package common;

import stacks.EmployeeStack;

import java.util.ArrayList;
import java.util.List;

public class Repair {

    public List <Repair> instances = new ArrayList<Repair>();

    private Car car; // Composition - If repair is destroyed - then the car within the repair is destroyed
    private List <Employee> employees; // Composition - If repair is destroyed - then the employees within the repair is destroyed
//    private UUID uuid;

    public Repair(Car car, Employee employee) {

    }

    public Repair store(Car car) {
//        UUID uuid; // So far we do not need to keep repairs
//        uuid = UUID.randomUUID();
//        this.uuid = uuid;

        this.car = car;
        this.employees = EmployeeStack.getInstance().getEmployees();

        return this;
//        instances.add(this);
    }
}
