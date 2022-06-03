package cc.alex.designpatterns23.creativemode.builder;

/**
 * Person对象的构造器
 *
 * @author binghe
 */
public class ManBuilder implements PersonBuilder {
    Person person;

    public ManBuilder() {
        person = new Man();
    }

    @Override
    public void buildBody() {
        person.setBody("建造男人的身体");
    }

    @Override
    public void buildFoot() {
        person.setFoot("建造男人的脚");
    }

    @Override
    public void buildHead() {
        person.setHead("建造男人的头");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
