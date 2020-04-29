package com.panmin.designpatterns.singleton;

import android.util.Log;

/**
 * 枚举
 * 优点：初始化时就已经实例化了，不存在多线程问题
 * 缺点：不能延迟加载
 */
public enum Singleton5Java {
    Instance;
    void test(){
        Log.i("Singleton5Java", "test: Singleton5Java");
    }
}
