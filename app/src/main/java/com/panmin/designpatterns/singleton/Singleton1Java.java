package com.panmin.designpatterns.singleton;

import android.util.Log;

/**
 * 饿汉模式
 * 优点：方便简单
 * 缺点：无法延迟加载、多线程会产生多个对象
 */
public class Singleton1Java {
    private static Singleton1Java mInstance = new Singleton1Java();
    public static Singleton1Java getInstance(){
        return mInstance;
    }
    public void test(){
        Log.i("Singleton1Java", "test: Singleton1Java");
    }
}
