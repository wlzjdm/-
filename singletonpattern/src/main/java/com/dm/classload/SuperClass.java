package com.dm.classload;

/**
 * Created by FDD on 2017/11/22.
 */

public class SuperClass extends SSClass {
    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;

    public SuperClass() {
        System.out.println("init SuperClass");
    }
}

