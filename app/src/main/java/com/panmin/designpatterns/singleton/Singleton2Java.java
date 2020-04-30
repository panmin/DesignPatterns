package com.panmin.designpatterns.singleton;

import android.util.Log;

/**
 * 懒汉模式
 * 优点：延迟加载
 * 缺点：由于使用了synchronized，会导致每次进入这个方法都被锁定，影响性能
 */
public class Singleton2Java {
    private Singleton2Java(){}
    private static Singleton2Java mInstance;

    public static synchronized Singleton2Java getInstance() {
        if (mInstance == null) {
            mInstance = new Singleton2Java();
        }
        return mInstance;
    }
    public void test(){
        Log.i("Singleton2Java", "test: Singleton2Java");
    }
}
