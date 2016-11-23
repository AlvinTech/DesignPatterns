package bridge;

/**
 * Created by Alvin on 16/11/22.
 */
public class Guest implements Transport {
    @Override public void transport() {
        System.out.println("Guest");
    }
}
