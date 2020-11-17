package com.niu.design.pattern.creational.prototype;

/**
 * 原型模式
 *
 * @author [nza]
 * @version 1.0 [2020/10/30 13:34]
 * @createTime [2020/10/30 13:34]
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail: " + mail.toString());
        for (int i = 0; i < 10; i++) {
            Mail temp = (Mail) mail.clone();
            temp.setName("name: " + i);
            temp.setEmailAddress(i + "@qq.com");
            temp.setContent("第" + i + "次起飞");
            System.out.println("克隆的mail: " + temp.toString());
            MailUtil.sendMail(temp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
