package common;

public class Person {
    private int age;
    private String first_name;
    private String last_name;
    private String telephone_number;

//    Person() {}

    public Person(int age, String first_name, String last_name, String telephone_number) {
        this.age = age;
        this.first_name = first_name;
        this.last_name = last_name;
        this.telephone_number = telephone_number;
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
