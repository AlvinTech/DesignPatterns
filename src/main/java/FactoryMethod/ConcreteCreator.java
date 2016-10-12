package FactoryMethod;

/**
 * Created by Alvin on 16/10/10.
 */
public class ConcreteCreator extends Creator {

    @Override
    public <T extends Pizze> T getPizze(Class<T> clazz) {
        Pizze pizze = null ;
        try {
            pizze = (T) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) pizze;
    }
}
