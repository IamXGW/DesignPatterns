package main.java.com.iamxgw.singleton_pattern;

/**
 * @description: 单例模式
 * @author: IamXGW
 * @create: 2025-03-16 21:30
 */
public class Singleton_2 {

    // 在静态初始化器中创建单例实例，这样 JVM 可以保证在任何线程访问 uniqueInstance 静态变量之前，一定先创建此实例
    private static Singleton_2 uniqueInstance = new Singleton_2();

    private Singleton_2() {}

    // 已经有 uniqueInstance 实例了，直接返回
    public static Singleton_2 getInstance() {
        return uniqueInstance;
    }
}