package cc.alex.designpatterns23.creativemode.Singleton;

/**
 * @author alex
 * @description
 * @since 2022-06-03
 */
public class SingletonExample8 {
    private SingletonExample8() {
    }

    private static class Holder {
        private static SingletonExample8 instance = new SingletonExample8();
    }

    public static SingletonExample8 getInstance() {
        return Holder.instance;
    }
}
