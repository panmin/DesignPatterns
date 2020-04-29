package com.panmin.designpatterns.singleton;

import android.util.Log;

/**
 * 静态内部类
 * 优点：利用JVM的机制，在运行时会初始化静态内部类的静态成员，这时还没有调用getInstance方法
 * 缺点：初始化时间比较早，不能延迟加载
 */
public class Singleton4Java {
    private static Singleton4Java mInstance;

    public static Singleton4Java getInstance() {
        return SingletonHolder.singletonHolder;
    }

    private static class SingletonHolder {
        static Singleton4Java singletonHolder = new Singleton4Java();
    }

    public void test(){
        Log.i("Singleton4Java", "test: Singleton4Java");
    }
}
