package com.solid.design.principle.srp.report;

import com.solid.design.principle.srp.bo.Employee;

public class EmployeeReport extends ReportFormatter {

    public EmployeeReport(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormattedReport() {
        return getFormattedResult();
    }
}
