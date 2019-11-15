package seeds;

import common.*;

public class EmployeeSeeder extends Seeder {
    public void seed() {
        Employee.store(52, "Anton", "Kovac", "+421 919 581 012");
        Employee.store(752, "Gandalf", "The White", "+421 111 222 333");
    }
}
