package common;

import stacks.CarStack;
import seeds.Seeder;
import stacks.EmployeeStack;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Get some data
        new Seeder().seed();

        List<Car> cars = CarStack.getInstance().getCars();

        // We only call the same instance of employee stack singleton to filter data - TODO refactor - testing purposes
        List<Employee> employees = EmployeeStack.getInstance().getFreeEmployees();
        Repair repair = new Repair(cars.get(0), employees);

        List<Employee> employees2 = EmployeeStack.getInstance().getFreeEmployees();
        Repair repair2 = new Repair(cars.get(1), employees2);

        List<Employee> employees3 = EmployeeStack.getInstance().getFreeEmployees();
        Repair repair3 = new Repair(cars.get(2), employees3);

        System.out.println(repair);
        System.out.println(repair2);
        System.out.println(repair3);
    }
}
