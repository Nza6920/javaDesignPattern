package com.niu.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * 邮件工具类
 *
 * @author [nza]
 * @version 1.0 [2020/10/30 13:26]
 * @createTime [2020/10/30 13:26]
 */
public class MailUtil {

    /**
     * 发送邮件
     *
     * @param mail 邮件对象
     * @author nza
     * @createTime 2020/10/30 13:32
     */
    public static void sendMail(Mail mail) {
        String outputContent = "向: {0}, 邮件地址: {1}, 邮件内容: {2}, 发送邮件成功";
        System.out.println(MessageFormat.format(outputContent,
                mail.getName(),
                mail.getEmailAddress(),
                mail.getContent()));
    }

    /**
     * 保存邮件记录
     *
     * @param mail 邮件对象
     * @author nza
     * @createTime 2020/10/30 13:32
     */
    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储邮件记录, originMail: " + mail.toString());
    }
}
