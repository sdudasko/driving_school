package seeds;

import common.Employee;
import common.Person;

public class EmployeeSeeder {
    public void seed() {
        Person.store(52, "Anton", "Kovac", "+421 919 581 012");
        Person.store(86, "Jozef", "Smrek", "+421 111 222 333");
    }
}
