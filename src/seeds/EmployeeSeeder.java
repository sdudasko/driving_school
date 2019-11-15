package seeds;

import common.*;

public class EmployeeSeeder extends Seeder {
    public void seed() {
        new Employee(52, "Anton", "Kovac", "+421 919 581 012");
        new Employee(752, "Gandalf", "The White", "+421 111 222 333");
    }
}
