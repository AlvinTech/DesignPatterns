package AbstractFactory;

/**
 * Created by Alvin on 16/10/11.
 */
public abstract class PrintDriver {
    String text = "This is ${resolution} print driver";
    public abstract void print();
}
