package com.niu.design.pattern.behavioral.iterator;

/**
 * 迭代器模式
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 11:00]
 * @createTime [2021/01/07 11:00]
 */
public class Test {

    public static void main(String[] args) {

        Course c1 = new Course("c1");
        Course c2 = new Course("c2");
        Course c3 = new Course("c3");
        Course c4 = new Course("c4");
        Course c5 = new Course("c5");
        Course c6 = new Course("c6");

        System.out.println("新增课程");
        CourseAggregateImpl courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(c1);
        courseAggregate.addCourse(c2);
        courseAggregate.addCourse(c3);
        courseAggregate.addCourse(c4);
        courseAggregate.addCourse(c5);
        courseAggregate.addCourse(c6);

        printCourse(courseAggregate);

        System.out.println("删除课程");
        courseAggregate.removeCourse(c1);
        courseAggregate.removeCourse(c2);

        printCourse(courseAggregate);
    }

    /**
     * 打印课程
     *
     * @param courseAggregate 课程
     */
    private static void printCourse(CourseAggregateImpl courseAggregate) {
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()) {
            Course course = courseIterator.nextCourse();
            System.out.println(course);
        }
    }
}
