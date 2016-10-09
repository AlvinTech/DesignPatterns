package singleton;

/**
 * Created by Alvin on 16/10/9.
 */
public class SingletonClass {
    private static class InstanceHolder{
         static final SingletonClass instance = new SingletonClass();
    }
    private SingletonClass(){}

    public static SingletonClass getInstance(){
        return InstanceHolder.instance;
    }
}
