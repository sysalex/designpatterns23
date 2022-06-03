package cc.alex.designpatterns23.creativemode.prototype;

/**
 *
 * Prototype
 * 原型类，实现Cloneable接口
 *
 * @author binghe
 */
public class Prototype implements Cloneable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
