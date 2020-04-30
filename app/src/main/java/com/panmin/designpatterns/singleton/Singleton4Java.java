package com.panmin.designpatterns.singleton;

import android.util.Log;

/**
 * 静态内部类
 * 优点：第一次getInstance时才会加载内部类，能够延迟加载，不会产生多线程问题
 * 缺点：第一次getInstance时耗时
 */
public class Singleton4Java {
    private Singleton4Java(){}
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
