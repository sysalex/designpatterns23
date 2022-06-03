package cc.alex.designpatterns23.creativemode.factory.generalfactory;

/**
 * ConcreteProduct
 * Work接口的具体实现类
 *
 * @author alex
 */
public class StudentWork implements Work {
    @Override
    public void doWork() {
        System.out.println("学生做作业!");
    }
}
