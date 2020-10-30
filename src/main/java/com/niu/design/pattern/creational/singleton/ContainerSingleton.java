package com.niu.design.pattern.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例模式 - 容器单例
 *
 * @version 1.0 [2020/10/29 16:22]
 * @author [nza]
 * @createTime [2020/10/29 16:22]
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    /**
     * 单例容器
     */
    private static Map<String, Object> singletonMap = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNoneBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
