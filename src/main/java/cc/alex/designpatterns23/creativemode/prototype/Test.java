package cc.alex.designpatterns23.creativemode.prototype;

/**
 * 测试类
 *
 * @author binghe
 */
public class Test {
    public static void main(String[] args) {
        Prototype pro = new ConcretePrototype("prototype");
        Prototype pro2 = (Prototype) pro.clone();
        System.out.println(pro.getName());
        System.out.println(pro2.getName());
    }
}
