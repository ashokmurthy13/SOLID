package com.solid.design.principle.srp.dao;

import com.solid.design.principle.srp.bo.Employee;

/**
 * DAO - Data Access Object
 */
public class EmployeeDAO {

    public String saveEmployee(Employee employee) {
        return "Employee Saved Successfully!";
    }

    public String deleteEmployee(Employee employee) {
        return "Deleted Employee Successfully";
    }
}
