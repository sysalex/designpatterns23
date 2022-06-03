package cc.alex.designpatterns23.creativemode.Singleton;

/**
 * @author alex
 * @since 2022-06-03
 * 懒汉模式，单例实例在第一次使用的时候进行创建，这个类是线程不安全的
 */
public class SingletonExample1 {
    private SingletonExample1() {
    }

    private static SingletonExample1 instance = null;

    public static SingletonExample1 getInstance() {
        if (instance == null) {
            //多个线程同时调用，可能会创建多个对象
            instance = new SingletonExample1();
        }
        return instance;
    }
}
