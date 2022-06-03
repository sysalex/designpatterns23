package cc.alex.designpatterns23.creativemode.factory.abstractactory;

/**
 * ICat接口的实现类
 *
 * @author alex
 */
public class BlackCat implements ICat {
    @Override
    public void eat() {
        System.out.println("The black cat is eating!");
    }
}
