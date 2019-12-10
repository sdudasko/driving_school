package seeds;

public class Seeder implements Seedable {
    public void seed() {
        new CarSeeder().seed();
        new EmployeeSeeder().seed();
    }
}
