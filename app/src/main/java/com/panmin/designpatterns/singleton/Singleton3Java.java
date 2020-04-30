package com.panmin.designpatterns.singleton;

import android.util.Log;

/**
 * 双重检测
 * 优点：延迟加载、利用synchronized锁定类，当mInstance不为null时不会执行，这时候不会影响性能
 * 缺点：首次加载速度慢
 */
public class Singleton3Java {
    private Singleton3Java(){}
    private static Singleton3Java mInstance;

    public static Singleton3Java getInstance() {
        if (mInstance == null) {
            synchronized (Singleton3Java.class) {
                if (mInstance == null) {
                    mInstance = new Singleton3Java();
                }
            }
        }
        return mInstance;
    }
    public void test(){
        Log.i("Singleton3Java", "test: Singleton3Java");
    }
}
