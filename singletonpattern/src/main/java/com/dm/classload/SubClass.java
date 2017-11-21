package com.dm.classload;

/**
 * Created by FDD on 2017/11/22.
 */

public class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init");
    }

    static int a=789;

    public SubClass() {
        System.out.println("init SubClass");
    }
}