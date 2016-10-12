package AbstractFactory;

/**
 * Created by Alvin on 16/10/11.
 */
public abstract class AbstractFactory {
    public abstract DisplayDriver getDisplayDriver();
    public abstract PrintDriver getPrintDriver();
}
