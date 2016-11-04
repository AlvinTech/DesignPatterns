package decorator;

/**
 * Created by Alvin on 16/11/4.
 */
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

}
