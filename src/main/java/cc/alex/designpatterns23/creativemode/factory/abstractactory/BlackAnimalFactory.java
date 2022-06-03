package cc.alex.designpatterns23.creativemode.factory.abstractactory;

/**
 * IAnimalFactory抽象工厂的实现类
 *
 * @author binghe
 */
public class BlackAnimalFactory implements IAnimalFactory {
    @Override
    public ICat createCat() {
        return new BlackCat();
    }

    public IDog createDog() {
        return new BlackDog();
    }
}
