package prototype;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Alvin on 16/11/1.
 */
@Data
public class SecondObject implements Serializable{
    private String secondName;

    public SecondObject(String value){
        this.secondName = value;
    }
}
