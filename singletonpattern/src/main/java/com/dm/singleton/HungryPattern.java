package com.dm.singleton;

/**
 * Created by FDD on 2017/11/22.
 * 单例模式分为饿汉模式和懒汉模式<br/>
 * <ol>
 *     <li>饿汉模式：在项目启动的时候就直接初始化实例，运行过程中直接引用。</li>
 *     <li>懒汉模式：在使用的时候初始化实例，通过代码逻辑保证只初始化一次</li>
 * </ol>
 */
public class HungryPattern {
    /**
     * 表明改类不可被继承，一般而言，单例模式的类是不可被继承的
     */
    private HungryPattern(){}

    /**
     * 类被加载的时候就直接初始化了。
     */
    private static HungryPattern hungryPattern = new HungryPattern();

    /**
     * 获取实例
     * @return 返回实例对象
     */
    public static HungryPattern getInstance(){
        return hungryPattern;
    }
}
