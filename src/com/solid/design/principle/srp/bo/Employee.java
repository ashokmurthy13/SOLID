package com.solid.design.principle.srp.bo;

/**
 * Single Responsibility Principle - SRP
 * <p>
 * A class should have a single reason to change. Classes that have a single responsibility are designed good.
 */
public class Employee {

    private long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String department;

    public Employee(long id, String firstName, String lastName, String gender, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.department = department;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
