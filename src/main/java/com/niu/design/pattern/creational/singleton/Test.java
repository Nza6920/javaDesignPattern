package com.niu.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式
 *
 * @author [nza]
 * @version 1.0 [2020/10/28 13:14]
 * @createTime [2020/10/28 13:14]
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println("end");

//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//
//        t1.start();
//        t2.start();

        // 1. 序列化破坏单例
//        EnumInstance singleton = EnumInstance.getInstance();
//        singleton.setData(new Object());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(singleton);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        EnumInstance newSingleton = (EnumInstance) ois.readObject();
//
//        System.out.println(singleton.getData() == newSingleton.getData());

        // 2. 反射破坏单例
//        Class<HungrySingleton> objectClass = HungrySingleton.class;
//        Constructor<HungrySingleton> constructor = objectClass.getDeclaredConstructor();
//
//        Class<StaticInnerClassSingleton> objectClass = StaticInnerClassSingleton.class;
//        Constructor<StaticInnerClassSingleton> constructor = objectClass.getDeclaredConstructor();
//
//        Class<LazySingleton> objectClass = LazySingleton.class;
//        Constructor<LazySingleton> constructor = objectClass.getDeclaredConstructor();

        Class<EnumInstance> objectClass = EnumInstance.class;
        Constructor<EnumInstance> constructor = objectClass.getDeclaredConstructor();

        // 设置方法权限为 public
        constructor.setAccessible(true);

//        HungrySingleton singleton1 = HungrySingleton.getInstance();
//        HungrySingleton singleton2 = constructor.newInstance();
//        StaticInnerClassSingleton staticInstance = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton staticInstance2 = constructor.newInstance();
//        LazySingleton lazySingletonInstance1 = LazySingleton.getInstance();

        EnumInstance singleton1 = EnumInstance.getInstance();
        singleton1.setData(new Object());
        EnumInstance singleton2 = constructor.newInstance();

        // 重置标志位
//        Field flag = lazySingletonInstance1.getClass().getDeclaredField("flag");
//        flag.setAccessible(true);
//        flag.set(lazySingletonInstance1, true);
//
//        LazySingleton lazySingletonInstance2 = constructor.newInstance();
//
        System.out.println(singleton1.getData() == singleton2.getData());
    }
}
