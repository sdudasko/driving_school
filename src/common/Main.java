package common;

import stacks.CarStack;
import seeds.Seeder;
import stacks.EmployeeStack;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Seeder().seed();

        CarStack storeHandler = CarStack.getInstance();

        List<Car> cars = CarStack.getInstance().getCars();

        List<Employee> employees = new ArrayList<Employee>();
        employees = EmployeeStack.getInstance().getEmployees();
        System.out.println(employees.get(1));
//        Repair storeRepairHandler = new Repair(cars.get(1), PersonStack.getInstance().getEmployees().get(1));

//        UUID uuid = UserInput.cta();
//
//        storeHandler.getInformation(uuid);
    }
}
