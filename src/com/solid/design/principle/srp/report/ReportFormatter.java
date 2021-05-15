package com.solid.design.principle.srp.report;

public class ReportFormatter {

    String formattedResult;

    public ReportFormatter(Object o, FormatType formatType) {
        switch (formatType) {
            case CSV:
                formattedResult = convertObjectToCSV(o);
                break;
            case XML:
                formattedResult = convertObjectToXML(o);
                break;
        }
    }

    private String convertObjectToXML(Object o) {
        return "XML : " + o.toString();
    }

    private String convertObjectToCSV(Object o) {
        return "CSV : " + o.toString();
    }

    protected String getFormattedResult() {
        return formattedResult;
    }
}
