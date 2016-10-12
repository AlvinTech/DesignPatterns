package singleton;

/**
 * Created by Alvin on 16/10/9.
 */
public class SingletonLazy {
    private static SingletonLazy instance ;

    private String SingletonDate;
    private SingletonLazy(){
        SingletonDate = "This is Singleton class";
    }

    public String getSingletonDate(){
        return SingletonDate;
    }

    public SingletonLazy getInstance(){
        if(null == instance){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
