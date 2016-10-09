package singleton;

/**
 * Created by Alvin on 16/10/9.
 */
public class SingletonLazy {
    private static SingletonLazy instance ;

    private SingletonLazy(){}

    public SingletonLazy getInstance(){
        if(null == instance){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
