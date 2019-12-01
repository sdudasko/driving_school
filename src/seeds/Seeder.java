package seeds;

public class Seeder implements Seedable {
    // TODO - multithread?
    public void seed() {
        new CarSeeder().seed();
        EmployeeSeeder.seed();
    }
}
