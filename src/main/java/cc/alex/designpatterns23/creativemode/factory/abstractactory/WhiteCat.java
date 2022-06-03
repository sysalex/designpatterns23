package cc.alex.designpatterns23.creativemode.factory.abstractactory;

/**
 * ICat的实现类
 *
 * @author alex
 */
public class WhiteCat implements ICat {
    @Override
    public void eat() {
        System.out.println("The white cat is eating!");
    }
}
