package common;

import seeds.Seeder;

import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        new Seeder().seed();
        Repair storeRepairHandler = new Repair();

        CarStack storeHandler = CarStack.getInstance();

        List<Car> cars = CarStack.getInstance().getCars();

        UUID uuid = UserInput.cta();

        storeHandler.getInformation(uuid);
    }
}
