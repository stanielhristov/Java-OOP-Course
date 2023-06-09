package EncapsulationSortByNameAndAge;

public class Person {
    private String firstName;
    private String lastName;


    public Person (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }




    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old.", firstName, lastName, age);
    }

    public int getAge() {
        return age;
    }

    private int age;

}
