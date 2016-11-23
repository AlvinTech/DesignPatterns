package bridge;

/**
 * Created by Alvin on 16/11/22.
 */
public class Goods  implements Transport{

    @Override
    public void transport() {
        System.out.println("Goods");
    }
}
