package prototype;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Alvin on 16/10/31.
 */

public class ArrayThing implements Cloneable {
    private ArrayList array = new ArrayList<String>();


    @Override
    public ArrayThing clone(){
        ArrayThing instance = null;
        try {
            instance = (ArrayThing) super.clone();
            instance.array = (ArrayList) array.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return instance;
    }

    public void add(String value){
        array.add(value);
    }

    public void println(){
        System.out.println(Arrays.toString(array.toArray()));
    }
}
