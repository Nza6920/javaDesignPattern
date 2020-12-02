package com.niu.design.pattern.structural.flyweight;

/**
 * <功能简述>
 *
 * @version 1.0 [2020/12/02 13:35]
 * @author [nza]
 * @createTime [2020/12/02 13:35]
 */
public class Test {

    private static final String departments[] = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
