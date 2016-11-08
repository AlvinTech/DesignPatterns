package observer;

import lombok.Data;

import java.util.Date;

/**
 * Created by Alvin on 16/11/8.
 */
@Data
public class Message {
    private Date date;
    private String message;
    private long id;

    public Message(long id, String message, Date date) {
        this.date = date;
        this.message = message;
        this.id = id;
    }

    @Override
    public String toString(){
        String result = "************************************************\n";
        result += "*    id: "+ id+"                                 ****\n";
        result += "*    content: "+ message+"                ****\n";
        result += "*    Time: "+ date+"     ****\n";
        result += "************************************************";
        return  result;
    }
}
