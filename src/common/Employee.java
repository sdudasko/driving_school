package common;

import stacks.EmployeeStack;

import java.util.UUID;

public class Employee extends Person {
    public Employee(int age, String first_name, String last_name, String telephone_number) {
        super(age, first_name, last_name, telephone_number);
    }
    public String toString() {
        return this.getFullName();
    }

    public static UUID store(int age, String first_name, String last_name, String telephone_number) {
        Employee employee = new Employee(age, first_name, last_name, telephone_number);

        UUID uuid;
        uuid = UUID.randomUUID();

        employee.uuid = uuid;
        employee.first_name = first_name;
        employee.last_name = last_name;

        EmployeeStack.getInstance().addEmployee(employee);

        return uuid;
    }
}
