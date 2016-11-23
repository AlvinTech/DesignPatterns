package bridge;

import java.util.Vector;

/**
 * Created by Alvin on 16/11/22.
 */
public class Train extends Vehicle {

    public Train(Transport implementor) {
        super(implementor);
    }

    @Override
    public void transport() {
        System.out.println("The vehicle is train........");
        super.transport();
    }
}

