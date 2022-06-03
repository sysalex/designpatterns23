package cc.alex.designpatterns23.creativemode.factory.abstractactory;

/**
 * IDog的实现类
 *
 * @author alex
 */
public class WhiteDog implements IDog {
    @Override
    public void eat() {
        System.out.println("The white dog is eating!");
    }
}
