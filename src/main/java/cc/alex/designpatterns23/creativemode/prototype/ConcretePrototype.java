package cc.alex.designpatterns23.creativemode.prototype;

/**
 * ConcretePrototype
 * 原型类的子类，用于构建原型
 *
 * @author binghe
 */
public class ConcretePrototype extends Prototype {
    public ConcretePrototype(String name) {
        setName(name);
    }
}
