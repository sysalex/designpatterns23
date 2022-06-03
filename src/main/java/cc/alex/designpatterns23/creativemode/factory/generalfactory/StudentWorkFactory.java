package cc.alex.designpatterns23.creativemode.factory.generalfactory;

/**
 * ConcreteCreator
 * IWorkFactory工厂的实现类
 *
 * @author binghe
 */
public class StudentWorkFactory implements IWorkFactory {
    @Override
    public Work getWork() {
        return new StudentWork();
    }
}
