package common;

import seeds.Seedable;
import stacks.CarStack;
import seeds.Seeder;
import stacks.EmployeeStack;
import stacks.RepairStack;

import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        // Get some data
        Seedable seeder = new Seeder();
        seeder.seed();

        List<Car> cars = CarStack.getInstance().getCars();

        // We only call the same instance of employee stack singleton to filter data - TODO refactor - testing purposes
        List<Employee> employees = EmployeeStack.getInstance().getFreeEmployees();
        Repair repair = new Repair(cars.get(0), employees);

        List<Employee> employees2 = EmployeeStack.getInstance().getFreeEmployees();
        Repair repair2 = new Repair(cars.get(1), employees2);

        List<Employee> employees3 = EmployeeStack.getInstance().getFreeEmployees();
        Repair repair3 = new Repair(cars.get(2), employees3);

        for (Repair repairInstance : RepairStack.getInstance().getInstances())
        {
//            System.out.println(repairInstance.getUuid());
        }
        UUID givenUUID = null;

//        while ((givenUUID = UserInput.cta()) != null) {
//            RepairStack.getInstance().getInformation(givenUUID);
//        }

        for (Employee employee : EmployeeStack.getInstance().getInstances())
        {
            System.out.println(employee);
        }
        System.out.println("");

        System.out.println(repair);
        System.out.println(repair2);
        System.out.println(repair3);
    }
}
