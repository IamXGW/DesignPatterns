package main.java.com.iamxgw.singleton_pattern;

/**
 * @description: 单例模式
 * @author: IamXGW
 * @create: 2025-03-16 21:30
 */
public class Singleton_3 {

    // volatile 关键字确保，当 uniqueInstance 变量被初始化成 Singleton_3 实例时，多个线程正确地处理 uniqueInstance 变量
    private volatile static Singleton_3 uniqueInstance;

    private Singleton_3() {}

    // 使用双重检查加锁，首先检查是否实例已经创建，如果尚未创建，才进行同步。这样只有第一次会同步
    public static Singleton_3 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton_3.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton_3();
                }
            }
        }
        return uniqueInstance;
    }
}