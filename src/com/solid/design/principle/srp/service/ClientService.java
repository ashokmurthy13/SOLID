package com.solid.design.principle.srp.service;

import com.solid.design.principle.srp.bo.Employee;
import com.solid.design.principle.srp.dao.EmployeeDAO;
import com.solid.design.principle.srp.report.EmployeeReport;
import com.solid.design.principle.srp.report.FormatType;

public class ClientService {

    public static String hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        System.out.println(employee);
        return employeeDAO.saveEmployee(employee);
    }

    public static String deleteEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        System.out.println(employee);
        return employeeDAO.deleteEmployee(employee);
    }

    public static String printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReport employeeReport = new EmployeeReport(employee, formatType);
        return employeeReport.getFormattedReport();
    }
}
