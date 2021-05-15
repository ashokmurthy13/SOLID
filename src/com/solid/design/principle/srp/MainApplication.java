package com.solid.design.principle.srp;

import com.solid.design.principle.srp.bo.Employee;
import com.solid.design.principle.srp.report.FormatType;
import com.solid.design.principle.srp.service.ClientService;

public class MainApplication {

    public static void main(String[] args) {

        // Hire New Employee
        Employee employee1 = new Employee(1, "ashok", "murthy", "male", "IT");
        System.out.println(ClientService.hireNewEmployee(employee1));

        // Print Employee Report
        System.out.println(ClientService.printEmployeeReport(employee1, FormatType.CSV));

        // Terminate Employee
        System.out.println(ClientService.deleteEmployee(employee1));
    }
}
