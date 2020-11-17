package com.niu.design.pattern.structural.facade;

/**
 * 门面模式
 * 资格校验业务类
 *
 * @author [nza]
 * @version 1.0 [2020/11/17 14:15]
 * @createTime [2020/11/17 14:15]
 */
public class QualifyService {

    public boolean isAvailable(PointsGift gift) {
        System.out.println("校验" + gift.getName() + "积分资格");
        return true;
    }
}
