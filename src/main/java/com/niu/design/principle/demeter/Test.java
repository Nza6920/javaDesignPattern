package com.niu.design.principle.demeter;

/**
 * 测试类
 *
 * @version 1.0 [2020/07/17 14:48]
 * @author [nza]
 * @createTime [2020/07/17 14:48]
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
