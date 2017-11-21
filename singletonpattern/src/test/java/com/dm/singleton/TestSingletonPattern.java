package com.dm.singleton;

import org.junit.Test;

/**
 * Created by FDD on 2017/11/22.
 */
public class TestSingletonPattern {
    /**
     * 饿汉模式测试，获取的是同一个实例
     */
    @Test
    public void testHungryGetInstance() {
        HungryPattern p1 = HungryPattern.getInstance();
        HungryPattern p2 = HungryPattern.getInstance();
        System.out.println(p1.hashCode() + ":" + p2.hashCode());
    }

    /**
     * 测试目的：
     * 1. 测试private类型的构造函数，是否可以通过反射实例化
     * 2. 测试通过反射来调用单例模式的方法，获取对象的结果是否一样
     *
     * 测试结果：
     * 1. 构造方法是private，会抛出IllegalAccessException
     * 2. 通过打印哈希值，发现是两个不同对象，所以不可通过反射来调用单例模式。
     * 我们通过反射调用时，要通过newInstance()方法生成一个新的对象，而static属性是生成对象的时候就初始化的。
     */
    @Test
    public void testReflectInvoke() {
        try {
            HungryPattern p1 = (HungryPattern) Class.forName("com.dm.singleton.HungryPattern").newInstance();
            System.out.println(p1.hashCode());

            HungryPattern p2 = (HungryPattern) Class.forName("com.dm.singleton.HungryPattern").newInstance();
            System.out.println(p2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
    }
}
