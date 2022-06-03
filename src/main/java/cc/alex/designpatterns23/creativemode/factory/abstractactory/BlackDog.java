package cc.alex.designpatterns23.creativemode.factory.abstractactory;

/**
 * IDog的实现类
 *
 * @author alex
 */
public class BlackDog implements IDog {
    @Override
    public void eat() {
        System.out.println("The black dog is eating");
    }
}
