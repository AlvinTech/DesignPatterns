package bridge;

/**
 * Created by Alvin on 16/11/22.
 */
public class Car extends Vehicle{

    public Car(Transport implementor) {
        super(implementor);
    }

    @Override
    public void transport() {
        System.out.println("The vehicle is car........");
        super.transport();
    }
}
