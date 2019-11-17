package common;

import stacks.CarStack;
import seeds.Seeder;
import stacks.EmployeeStack;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        new Seeder().seed();

        List<Car> cars = CarStack.getInstance().getCars();
        List<Employee> employees = EmployeeStack.getInstance().getFreeEmployees();

        Repair repair = new Repair(cars.get(0), employees);
        List<Employee> employees2 = EmployeeStack.getInstance().getFreeEmployees();
        Repair repair2 = new Repair(cars.get(1), employees2);
        List<Employee> employees3 = EmployeeStack.getInstance().getFreeEmployees();
        Repair repair3 = new Repair(cars.get(2), employees3);
        System.out.println(repair);
        System.out.println(repair2);
        System.out.println(repair3);
//        System.out.println(EmployeeStack.getInstance().getFreeEmployees().get(0));
    }
}
