package com.panmin.designpatterns.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器型的单例，适合多个单例的管理，对用户隐藏具体实现，降低耦合度
 */
public class Singleton6Java {
    private Singleton6Java(){}
    private static Map<String,Object> objectMap = new HashMap<>();

    public static void register(String key,Object object){
        objectMap.put(key,object);
    }

    public static Object get(String key){
        return objectMap.get(key);
    }
}
