package com.niu.design;


/**
 * <功能简述>
 *
 * @author [nza]
 * @version 1.0 [2020/11/17 16:39]
 * @createTime [2020/11/17 16:39]
 */
public class Test {

    /**
     * 显示JVM总内存，JVM最大内存和总空闲内存
     */
    public void displayAvailableMemory() {
        // 显示JVM总内存
        long totalMem = Runtime.getRuntime().totalMemory();
        System.out.println(totalMem + "MB");
        // 显示JVM尝试使用的最大内存
        long maxMem = Runtime.getRuntime().maxMemory();
        System.out.println(maxMem + "MB");
        // 空闲内存
        long freeMem = Runtime.getRuntime().freeMemory();
        System.out.println(freeMem + "MB");
    }

    /**
     * Starts the program
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Test().displayAvailableMemory();
    }
}