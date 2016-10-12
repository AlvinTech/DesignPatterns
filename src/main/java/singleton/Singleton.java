package singleton;

/**
 * Created by Alvin on 16/10/9.
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private static int singletonDate ;

    private Singleton(){}

    public static Singleton getInstance(){
        singletonDate++;
        return instance;
    }

    public int getSingletonDate(){
        return singletonDate;
    }
}
