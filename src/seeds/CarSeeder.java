package seeds;

import common.Car;
import common.Customer;
import common.Employee;

import java.util.*;

public class CarSeeder extends Seeder {

    @Override
    public void seed() {
        int i = 0;

        // TODO - Refactor - move somewhere else or at least to another method
        String[][] cars = {
                {"Mazda", "10000"},
                {"Opel", "12500"},
                {"Skoda", "800"},
                {"Ford", "800"},
                {"Renault", "4500"},
        };
        String[][] customers = {
                {"56", "Jan", "Budzak", "+114 111 234 225"},
                {"32", "Jozef", "Mraz", "+114 111 555 123"},
                {"25", "Pavol", "Novotny", "+114 111 123 225"},
                {"19", "Frantisek", "Sklenar", "+114 511 234 128"},
                {"23", "Blazej", "Petrovic", "+114 111 556 981"},
        };
        List <Customer> customers_arr = new ArrayList<Customer>();
        List all_damaged_parts_opts = Arrays.asList(Employee.positionMapping);

        /*
          Storing car
          Assigning damaged parts
         */
        for (String[] car_params : cars)
        {
            Customer customer = new Customer(Integer.parseInt(customers[i][0]), customers[i][1], customers[i][2], customers[i][0]);
            // TODO - multiple damaged parts,
            Random r = new Random();
            List<String> damaged_parts = new ArrayList<String>();
            damaged_parts.add((String) all_damaged_parts_opts.get(r.nextInt(4))); // TODO - fixed arr len
            Car.store(car_params[0], Integer.parseInt(car_params[1]), damaged_parts, customer);
            i++;
        }
    }
}
