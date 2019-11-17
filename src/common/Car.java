package common;

import java.util.List;
import java.util.UUID;

import stacks.CarStack;

public class Car {
    public UUID uuid;

    private String name;
    private int price;
    private List<String> damaged_parts;
    private Customer customer;

    public Car(Customer customer) {
        this.customer = customer;
    }

    public static UUID store(String name, int price, List<String> damaged_parts, Customer customer) {
        Car car = new Car(customer);

        UUID uuid;
        uuid = UUID.randomUUID();

        car.uuid = uuid;
        car.name = name;
        car.price = price;
        car.damaged_parts = damaged_parts;

        CarStack.getInstance().add(car);

        return uuid;
    }

    public String getName() {
        return this.name;
    }

    public List getDamagedParts() {
        return this.damaged_parts;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String toString() {
        return (this.name + ", " + this.price + ", " + this.damaged_parts + "\n");
    }

}
