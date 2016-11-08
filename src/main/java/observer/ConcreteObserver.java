package observer;

import lombok.Data;

/**
 * Created by Alvin on 16/11/8.
 */
@Data
public class ConcreteObserver implements Observer {
    private String type;
    private String address;

    public ConcreteObserver(String type, String address) {
        this.type = type;
        this.address = address;
    }

    public void update(Message message) {
        System.out.println("send " + type + " to: " + address);
        System.out.println( message);
    }

}
