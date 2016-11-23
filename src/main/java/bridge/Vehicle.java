package bridge;

import lombok.Data;

/**
 * Created by Alvin on 16/11/22.
 */
@Data
public abstract class Vehicle {

    private Transport implementor;

    public Vehicle(Transport implementor) {
        this.implementor = implementor;
    }

    public void transport(){
        implementor.transport();
    }
}
