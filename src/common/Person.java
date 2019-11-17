package common;

import java.util.UUID;

public class Person {
    protected int age;
    protected String first_name;
    protected String last_name;
    protected String telephone_number;
    protected UUID uuid;

    public Person(int age, String first_name, String last_name, String telephone_number) {
        this.age = age;
        this.first_name = first_name;
        this.last_name = last_name;
        this.telephone_number = telephone_number;
    }

    public static UUID store(int age, String first_name, String last_name, String telephone_number) {
        Person person = new Person(age, first_name, last_name, telephone_number);

        UUID uuid;
        uuid = UUID.randomUUID();

        person.uuid = uuid;
        person.first_name = first_name;
        person.last_name = last_name;

        return uuid;
    }

    public String getFirstName() {
        return this.first_name;
    }

    public int getAge() {
        return this.age;
    }

    public String getTelephoneNumber() {
        return this.telephone_number;
    }

    public String getFullName() {
        return this.first_name + " " + this.last_name;
    }
}
