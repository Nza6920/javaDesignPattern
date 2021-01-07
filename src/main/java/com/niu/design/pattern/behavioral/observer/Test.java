package com.niu.design.pattern.behavioral.observer;

/**
 * 观察者模式
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 14:22]
 * @createTime [2021/01/07 14:22]
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course("课程1");
        Teacher teacher = new Teacher("姚焕玲");

        course.addObserver(teacher);

        Question question = new Question();
        question.setContent("到底D闪强还是F闪强?");
        question.setUsername("小明");

        course.produceQuestion(course, question);

    }
}
