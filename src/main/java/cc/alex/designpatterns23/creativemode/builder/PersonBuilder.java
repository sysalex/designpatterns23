package cc.alex.designpatterns23.creativemode.builder;

/**
 * Person对象的构造接口
 *
 * @author alex
 */
public interface PersonBuilder {
    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}
