package com.niu.design.pattern.behavioral.chainofresponsibility;

/**
 * 责任链模式
 *
 * @author [nza]
 * @version 1.0 [2021/01/08 09:32]
 * @createTime [2021/01/08 09:32]
 */
public abstract class Approver {

    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
