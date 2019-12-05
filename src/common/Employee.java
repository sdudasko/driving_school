package common;

import stacks.EmployeeStack;

import java.util.UUID;

public class Employee extends Person {
    public static final String[] positionMapping = new String[]{"wheels", "karoserie", "vyfuk", "tlmic", "prevodovka"};

    private boolean busy = false;
    private int position;

    public Employee(int age, String first_name, String last_name, String telephone_number, int position) {
        super(age, first_name, last_name, telephone_number);

        this.position = position;
    }

    public String toString() {
        return "Name: " + this.getFullName() + ". Specialization: " + positionMapping[this.position];
    }

    // Pretazovanie
    public static UUID store(int age, String first_name, String last_name, String telephone_number, int position) {
        Employee employee = new Employee(age, first_name, last_name, telephone_number, position);

        UUID uuid;
        uuid = UUID.randomUUID();

        employee.uuid = uuid;
        employee.first_name = first_name;
        employee.last_name = last_name;

        EmployeeStack.getInstance().addEmployee(employee);

        return uuid;
    }

    public void setBusy() {
        this.busy = true;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public boolean isBusy() {
        return busy;
    }

    public String getContactInfo() {
        String company_prefix = "+18";
        return company_prefix + this.telephone_number;
    }
}
