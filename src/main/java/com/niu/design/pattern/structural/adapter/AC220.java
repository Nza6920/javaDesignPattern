package com.niu.design.pattern.structural.adapter;

/**
 * 适配器模式
 *
 * @version 1.0 [2020/12/02 10:56]
 * @author [nza]
 * @createTime [2020/12/02 10:56]
 */
public class AC220 {
    public int outputAC220V() {
        int output = 220;
        System.out.println("输出交流电" + output + "V");
        return output;
    }
}
