package prototype;

/**
 * Created by Alvin on 16/10/30.
 */
public class Thing implements Cloneable {

    public Thing(){
       // System.out.println("construction.......... ");
        int i = 0 ;
    }

    @Override
    public Thing clone(){
        Thing instance = null;
        try {
            instance = (Thing) super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return instance;
    }
}
