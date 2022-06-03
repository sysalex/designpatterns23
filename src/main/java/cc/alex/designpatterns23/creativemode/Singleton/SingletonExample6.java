package cc.alex.designpatterns23.creativemode.Singleton;

/**
 * @author alex
 * @description 饿汉模式，单例实例在类装载的时候进行创建，是线程安全的
 * @since 2022-06-03
 */
public class SingletonExample6 {
    private SingletonExample6() {
    }

    private static SingletonExample6 instance;

    static {
        instance = new SingletonExample6();
    }

    public static SingletonExample6 getInstance() {
        return instance;
    }

}
