package cc.alex.designpatterns23.creativemode.factory.generalfactory;

/**
 * 测试类
 *
 * @author binghe
 */
public class Test {
    public static void main(String[] args) {
        IWorkFactory studentWorkFactory = new StudentWorkFactory();
        studentWorkFactory.getWork().doWork();
        IWorkFactory teacherWorkFactory = new TeacherWorkFactory();
        teacherWorkFactory.getWork().doWork();
    }
}
