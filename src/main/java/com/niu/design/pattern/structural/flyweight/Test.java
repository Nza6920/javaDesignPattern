package com.niu.design.pattern.structural.flyweight;

/**
 * 享元模式
 *
 * @author [nza]
 * @version 1.0 [2020/12/02 13:35]
 * @createTime [2020/12/02 13:35]
 */
public class Test {

    private static final String[] DEPARTMENTS = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10.; i++) {
            String department = DEPARTMENTS[(int) (Math.random() * DEPARTMENTS.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
