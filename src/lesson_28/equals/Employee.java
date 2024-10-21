package lesson_28.equals;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Employee(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // links counts the same objects
        if (!(obj instanceof Employee)) return false; // checking for possibility of instanting to Employee
        Employee employee = (Employee) obj;


        // maybe is NPE showing
       // firstName.equals(employee.firstName);

        // if comparing any objects of null, should  return false

        // safety comparing of objects, counting possibility of null
        return  Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(dateOfBirth, employee.dateOfBirth);

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
