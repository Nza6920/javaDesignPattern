package com.niu.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式
 *
 * @author [nza]
 * @version 1.0 [2020/12/02 13:31]
 * @createTime [2020/12/02 13:31]
 */
public class EmployeeFactory {

    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        if (manager == null) {
            manager = new Manager(department);
            System.out.println("创建部门经理: " + department);
            String report = department + "汇报";
            manager.setReportContent(report);
            System.out.println("创建报告: " + report);
            EMPLOYEE_MAP.put(department, manager);
        }

        return manager;
    }
}
