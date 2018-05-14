package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.NotThreadSafe;
import com.mmall.concurrency.annoations.ThreadSafe;

/**
 * Created by chenjun on 2018/5/3.
 */
@ThreadSafe
public class SingletonExample5 {

    private SingletonExample5() {

    }

    private volatile static SingletonExample5 instance = null;

    public static SingletonExample5 getInstance() {
        if (instance == null) {
            synchronized (SingletonExample5.class) {
                if (instance == null) {
                    instance = new SingletonExample5();
                    System.out.println("初始化");
                }
            }
        }
        return instance;
    }
}
