package com.niu.design.pattern.behavioral.mediator;

import java.util.Calendar;

/**
 * 中介者模式
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 16:21]
 * @createTime [2021/01/07 16:21]
 */
public class StudyGroup {
    public static void showMessage(User user, String message) {
        System.out.println(Calendar.getInstance().getTime() + "[" + user.getName() + "]" + "-" + message);
    }
}
