package seeds;

import common.Person;

public class EmployeeSeeder {
    public void seed() {
        Person.store(52, "Anton", "Kovac", "+421 919 581 012", 1);
        Person.store(86, "Jozef", "Smrek", "+421 111 222 333", 2);
        Person.store(86, "Jan", "Majster", "+420 512 511 510", 3);
    }
}
