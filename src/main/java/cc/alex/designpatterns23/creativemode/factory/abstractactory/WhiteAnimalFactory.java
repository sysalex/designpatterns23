package cc.alex.designpatterns23.creativemode.factory.abstractactory;

/**
 * IAnimalFactory抽象工厂的实现类
 *
 * @author alex
 */
public class WhiteAnimalFactory implements IAnimalFactory {
    public ICat createCat() {
        return new WhiteCat();
    }

    public IDog createDog() {
        return new WhiteDog();
    }
}
