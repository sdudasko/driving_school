package stacks;

import common.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStack {

    private static EmployeeStack carStackInstance = null;
    private List<Employee> instances = null;

    private EmployeeStack() {
        instances = new ArrayList<Employee>();
    }

    public static EmployeeStack getInstance() {
        if (carStackInstance == null) {
            carStackInstance = new EmployeeStack();
        }
        return carStackInstance;
    }

    public void addEmployee(Employee employee) {
        instances.add(employee);
    }

    public List<Employee>getEmployees() {
        return this.instances;
    }
}
