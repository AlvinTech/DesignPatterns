package composite;

/**
 * Created by Alvin on 16/11/7.
 */
public abstract class Component {
    protected String position;
    protected String name;

    public String getInfo() {
        return "name: " + name + " position: "+position;
    }

    public Component(String name, String position) {
        this.position = position;
        this.name = name;
    }
}
