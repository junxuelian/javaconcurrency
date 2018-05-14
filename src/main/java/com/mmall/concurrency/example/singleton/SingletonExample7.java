package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.Recommend;
import com.mmall.concurrency.annoations.ThreadSafe;
import sun.security.jca.GetInstance;

/**
 * Created by chenjun on 2018/5/3.
 */
@ThreadSafe
@Recommend
public class SingletonExample7 {

    private static class InstanceHolder {
        public static SingletonExample7 singletonExample7 = new SingletonExample7();
    }

    public static SingletonExample7 getInstance() {
        return InstanceHolder.singletonExample7;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
        System.out.println(getInstance());
    }
}
