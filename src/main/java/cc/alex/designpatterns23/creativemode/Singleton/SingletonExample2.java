package cc.alex.designpatterns23.creativemode.Singleton;

/**
 * @author alex
 * @since 2022-06-03
 * 饿汉模式，单例实例在类装载的时候进行创建，是线程安全的
 */
public class SingletonExample2 {
    private SingletonExample2() {
    }

    private static SingletonExample2 instance = new SingletonExample2();

    public static SingletonExample2 getInstance() {
        return instance;
    }
}
