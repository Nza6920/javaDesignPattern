package com.niu.design.pattern.structural.flyweight;

/**
 * 享元模式
 *
 * @version 1.0 [2020/12/02 13:28]
 * @author [nza]
 * @createTime [2020/12/02 13:28]
 */
public class Manager implements Employee {

    private String department;

    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
