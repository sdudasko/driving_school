package seeds;

import common.Employee;

abstract public class EmployeeSeeder {
    public static void seed() {
        Employee.store(52, "Anton", "Kovac", "+421 919 581 012", 1);
        Employee.store(86, "Jozef", "Smrek", "+421 111 222 333", 0);
    }
}
