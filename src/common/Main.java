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
        int i = 0;
        for (Car carInstance : CarStack.getInstance().getCars()) {
            List<Employee> employees = EmployeeStack.getInstance().getFreeEmployees();
            new Repair(cars.get(i), employees);
            i++;
        }

        System.out.println("List of employees:\n");

        for (Employee employee : EmployeeStack.getInstance().getInstances()) {
            System.out.println(employee + ", specialization: " + Employee.positionMapping[employee.getPosition()]);
        }

        System.out.println("\n-------------------\n");
        System.out.println("Car IDs:\n");
        for (Repair repairInstance : RepairStack.getInstance().getInstances()) {
            System.out.println(repairInstance.getUuid());
        }

        System.out.println("");
        UUID givenUUID = null;

        while ((givenUUID = UserInput.cta()) != null) {
            RepairStack.getInstance().getInformation(givenUUID);
        }

    }
}
