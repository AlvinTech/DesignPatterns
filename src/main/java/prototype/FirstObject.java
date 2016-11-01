package prototype;

import lombok.Data;

import java.io.*;
import java.util.Date;

/**
 * Created by Alvin on 16/11/1.
 */
@Data
public class FirstObject implements Cloneable,Serializable {

    private Date birthday;

    private String firstName;

    private SecondObject secondObject;


    public FirstObject clone(){
        FirstObject  object = null;
        try {
            object = (FirstObject) super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }

    public FirstObject deepClone(){
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (FirstObject) ois.readObject();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
