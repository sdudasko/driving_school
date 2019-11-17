package stacks;

import common.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStack {

    private static EmployeeStack employeeStackInstance = null;
    private List<Employee> instances = null;

    private EmployeeStack() {
        instances = new ArrayList<Employee>();
    }

    public static EmployeeStack getInstance() {
        if (employeeStackInstance == null) {
            employeeStackInstance = new EmployeeStack();
        }
        return employeeStackInstance;
    }

    public void addEmployee(Employee employee) {
        instances.add(employee);
    }

    public List<Employee> getInstances() {
        return this.instances;
    }

    public List<Employee> getFreeEmployees() {
        ArrayList<Employee>freeEmployees = new ArrayList<Employee>();

        for (Employee employee : this.instances)
        {
            if (!employee.isBusy())
                freeEmployees.add(employee);
        }

        return freeEmployees;
    }
}
