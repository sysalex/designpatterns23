package cc.alex.designpatterns23.creativemode.factory.generalfactory;

/**
 * Creator
 * 抽象工厂接口
 *
 * @author binghe
 */
public interface IWorkFactory {
    /**
     * 定义获取Work实例对象的方法
     *
     * @return
     */
    Work getWork();
}
