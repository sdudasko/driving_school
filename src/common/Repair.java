package common;

import stacks.RepairStack;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Repair {
    private RepairPriceService rp;
    public List<Repair> instances = new ArrayList<Repair>();

    private Car car; // Composition - If repair is destroyed - then the car within the repair is destroyed
    // We take employees as a param so we don't have to filter through all employees all over again // TODO - refactor
    private List<Employee> free_employees; // Composition - If repair is destroyed - then the employees within the repair is destroyed
    private List<Employee> assigned_employees = new ArrayList<Employee>();
    private int price_for_repair;
    private UUID uuid;

    public Repair(Car car, List<Employee> free_employees) {

        UUID uuid;
        uuid = UUID.randomUUID();
        this.uuid = uuid;

        this.car = car;
        this.free_employees = free_employees;
        rp = new RepairPriceService();
        if (rp.getPrice(car) > 0) {
            this.price_for_repair = rp.getPrice();
        }

        this.assignEmployees();
        RepairStack.getInstance().addRepair(this);
    }

    private void assignEmployees() {
        List<Employee> assigned_employees = new ArrayList<Employee>();

        for (Employee employee : free_employees) {
            if (car.getDamagedParts().contains(Employee.positionMapping[employee.getPosition()])) {
                if (this.price_for_repair < car.getPrice()) {
                    assigned_employees.add(employee);
                    employee.setBusy();
                }
            }
        }
        this.assigned_employees = assigned_employees;
    }

    public String toString() {
        String worthSaving = this.price_for_repair > car.getPrice() ? "It is not worth to repair this car so no employees were assigned to do this task.\n" : "";

        String assigned = "";
        if (this.price_for_repair < car.getPrice()) {
            assigned = assigned_employees.size() > 0 ? "Assigned employee: " + assigned_employees.get(0) + ".\n" : "No employees are currently available for this repair.\n";
        }

        return "\nName: " + car.getName() + ".\n" +
                "Price: " + car.getPrice() + "$.\n" +
                "Owner: " + car.getCustomer().getFullName() + ".\n" +
                assigned +
                "Repair price: " + this.price_for_repair + "€.\n" +
                worthSaving +
                "Broken part: " + car.getDamagedParts().get(0) + ".\n";
    }

    public UUID getUuid() {
        return uuid;
    }
}
