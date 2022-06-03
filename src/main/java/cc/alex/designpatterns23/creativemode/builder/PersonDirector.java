package cc.alex.designpatterns23.creativemode.builder;

/**
 * Person对象的整体构造器
 *
 * @author binghe
 */
public class PersonDirector {
    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
