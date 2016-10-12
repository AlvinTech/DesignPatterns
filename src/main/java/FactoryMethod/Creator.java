package FactoryMethod;

/**
 * Created by Alvin on 16/10/10.
 */
public abstract  class Creator {
    public abstract <T extends Pizze> T getPizze(Class<T> clazz);
}
