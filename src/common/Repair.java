package common;

import stacks.EmployeeStack;

import java.util.ArrayList;
import java.util.List;

public class Repair {

    public List<Repair> instances = new ArrayList<Repair>();

    private Car car; // Composition - If repair is destroyed - then the car within the repair is destroyed
    // We take employees as a param so we don't have to filter through all employees all over again // TODO - refactor
    private List<Employee> free_employees; // Composition - If repair is destroyed - then the employees within the repair is destroyed
    private List<Employee> assigned_employees = new ArrayList<Employee>();
//    private UUID uuid;

    public Repair(Car car, List<Employee> free_employees) {
        this.car = car;
        this.free_employees = free_employees;

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

//    public Repair store(Car car) {
//
//        this.car = car;
//        this.free_employees = EmployeeStack.getInstance().getInstances();
//
//        return this;
////        instances.add(this);
//    }

    public String toString() {
        return "Car name: " + car.getName() + ". Assigned employees: " + assigned_employees;
    }
}
