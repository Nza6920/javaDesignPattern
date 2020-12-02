package com.niu.design.pattern.structural.adapter;

/**
 * PowerAdapter
 *
 * @author [nza]
 * @version 1.0 [2020/12/02 10:58]
 * @createTime [2020/12/02 10:58]
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        return adapterInput;
    }
}
