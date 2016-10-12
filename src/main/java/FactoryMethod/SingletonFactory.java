package FactoryMethod;


import singleton.SingletonLazy;

import java.lang.reflect.Constructor;

/**
 * Created by Alvin on 16/10/10.
 */
public class SingletonFactory {
    private static SingletonLazy instance ;
    static{
        try {
            Class clazz = Class.forName(SingletonLazy.class.getName());
            Constructor constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            instance = (SingletonLazy) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static SingletonLazy getInstance(){
        return instance;
    }
}
