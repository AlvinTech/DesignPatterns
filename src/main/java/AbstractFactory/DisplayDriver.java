package AbstractFactory;

/**
 * Created by Alvin on 16/10/11.
 */
public abstract  class DisplayDriver {
    String text = "This is ${resolution} display  driver";
    public abstract void display();
}
