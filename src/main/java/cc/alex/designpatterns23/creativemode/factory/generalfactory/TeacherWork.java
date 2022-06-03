package cc.alex.designpatterns23.creativemode.factory.generalfactory;

/**
 * ConcreteProduct
 * Work接口的具体实现类
 *
 * @author alex
 */
public class TeacherWork implements Work {
    public void doWork() {
        System.out.println("老师审批作业!");
    }
}
