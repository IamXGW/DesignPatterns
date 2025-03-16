package main.java.com.iamxgw.singleton_pattern;

/**
 * @description: 单例模式
 * @author: IamXGW
 * @create: 2025-03-16 21:30
 */
public class Singleton_1 {

    // 使用静态变量来记录唯一实例
    private static Singleton_1 uniqueInstance;

    // 构造器私有化，只有 SingletonPattern_1 类内才可以调用构造器
    private Singleton_1() {}

    // 提供一个全局访问点，返回 uniqueInstance
    public static Singleton_1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton_1();
        }
        return uniqueInstance;
    }
}