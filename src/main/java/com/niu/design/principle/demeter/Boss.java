package com.niu.design.principle.demeter;

/**
 * 迪米特法则 - 老板
 *
 * @author [nza]
 * @version 1.0 [2020/07/17 14:44]
 * @createTime [2020/07/17 14:44]
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourse();
    }
}
