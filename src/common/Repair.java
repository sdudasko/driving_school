package common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Repair {
    RepairPriceService rp;
    public List<Repair> instances = new ArrayList<Repair>();

    private Car car; // Composition - If repair is destroyed - then the car within the repair is destroyed
    // We take employees as a param so we don't have to filter through all employees all over again // TODO - refactor
    private List<Employee> free_employees; // Composition - If repair is destroyed - then the employees within the repair is destroyed
    private List<Employee> assigned_employees = new ArrayList<Employee>();
    private int price_for_repair;
//    private UUID uuid;

    public Repair(Car car, List<Employee> free_employees) {
        this.car = car;
        this.free_employees = free_employees;
        rp = new RepairPriceService();
        this.price_for_repair = rp.getPrice();

        this.assignEmployees();
    }

    private void assignEmployees() {
        List<Employee> assigned_employees = new ArrayList<Employee>();
        // TODO - now cars only have 1 broken part
        for (Employee employee : free_employees) {
            if (car.getDamagedParts().contains(Employee.positionMapping[employee.getPosition()])) {
                assigned_employees.add(employee);
                employee.setBusy();
            }
        }
        this.assigned_employees = assigned_employees;
    }

    public String toString() {
        return "Car name: " + car.getName() + ". Car price: " + car.getPrice() + ". Assigned employees: " + assigned_employees + ". Repair price: " + this.price_for_repair + ".";
    }
}
