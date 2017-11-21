package com.dm.classload;

/**
 * Created by FDD on 2017/11/22.
 * 测试类加载顺序，结果很出乎意外：
 * 子类继承父类，当通过子类输出父类的静态变量时，子类不会被加载。
 */
public class ClassLoadLearn {

    public static void main(String[] args) {
        //只有用到子类的时候才会被加载
        System.out.println(SubClass.value);
        System.out.println("-----------------------");
        System.out.println(SubClass.a);
    }
}

