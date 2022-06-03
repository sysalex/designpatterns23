package cc.alex.designpatterns23.creativemode.factory.abstractactory;

/**
 * 这个接口就是类图中标识的
 * AbstractFactory抽象工厂
 *
 * @author alex
 */
public interface IAnimalFactory {
    /**
     * 定义创建Icat接口实例的方法
     *
     * @return
     */
    ICat createCat();

    /**
     * 定义创建IDog接口实例的方法
     *
     * @return
     */
    IDog createDog();
}
