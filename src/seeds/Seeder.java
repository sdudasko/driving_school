package seeds;

public class Seeder implements Seedable {
    @Override
    public void seed() {
        new CarSeeder().seed();
    }
}
