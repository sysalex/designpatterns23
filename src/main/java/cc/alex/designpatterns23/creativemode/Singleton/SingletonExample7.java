package cc.alex.designpatterns23.creativemode.Singleton;

/**
 * * @description 枚举方式进行实例化，是线程安全的，此种方式也是线程最安全的
 */
public class SingletonExample7 {
    private SingletonExample7() {
    }

    public static SingletonExample7 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;
        private SingletonExample7 singleton;

        //JVM保证这个方法绝对只调用一次
        Singleton() {
            singleton = new SingletonExample7();
        }

        public SingletonExample7 getInstance() {
            return singleton;
        }
    }
}
